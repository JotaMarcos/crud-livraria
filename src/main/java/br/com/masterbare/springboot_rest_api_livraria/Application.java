package br.com.masterbare.springboot_rest_api_livraria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * Spring Boot application starter class
 */
@EntityScan(basePackages = "br.com.masterbare.model")
@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.masterbare.repository")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); /*É a linha principal que roda o projeto Java Spring Boot*/
    }
}
