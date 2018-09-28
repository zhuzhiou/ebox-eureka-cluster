# eureka-server集群

**基于IP地址的配置**

IP地址规划：172.16.28.116、172.16.28.129

172.16.28.116主机上的application.yml

```yaml
eureka:
  client:
    service-url:
      defaultZone: http://172.16.28.129:8761/eureka/
  instance:
    prefer-ip-address: true
```

172.16.28.129主机的application.yml

```yaml
eureka:
  client:
    service-url:
      defaultZone: http://172.16.28.116:8761/eureka/
  instance:
    prefer-ip-address: true
```

**基于命名服务的配置**

命名规划：eureka1、eureka2，如果命名指定同一台机器，还需要为程序指定不同的端口。

eureka1的application.yml

```yaml
eureka:
  client:
    service-url:
      defaultZone: http://eureka2:8761/eureka/
```

eureka1的application.yml

```yaml
eureka:
  client:
    service-url:
      defaultZone: http://eureka1:8761/eureka/
```

> 无论是那个，都需要确保eureka.client.register-with-eureka设置true，否则这些Replicas只会出现在unavailable-replicas，而不是available-replicas。