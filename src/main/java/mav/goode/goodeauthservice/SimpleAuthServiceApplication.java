package mav.goode.goodeauthservice;

import mav.goode.goodeauthservice.config.AppJwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableConfigurationProperties(AppJwtProperties.class)
public class SimpleAuthServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleAuthServiceApplication.class, args);
    }

}
