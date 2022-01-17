package com.apollo.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class ApolloMydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloMydemoApplication.class, args);
    }

}
