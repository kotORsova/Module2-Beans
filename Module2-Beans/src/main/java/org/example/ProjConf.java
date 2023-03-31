package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjConf {
    @Bean
    @Primary
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Kesha");
        return p;
    }

    @Bean("stepa")
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Stepa");
        return p;
    }

    @Bean
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Jora");
        return p;
    }
}
