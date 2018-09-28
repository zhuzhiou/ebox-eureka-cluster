package ebox;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterMain {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClusterMain.class).web(true).run(args);
    }
}
