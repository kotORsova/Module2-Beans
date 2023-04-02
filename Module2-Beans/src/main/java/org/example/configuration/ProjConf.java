package org.example.configuration;

import org.example.main.Parrot;
import org.example.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjConf {
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Gosha");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("Kesha");
        p.setParrot(parrot);
        return p;
    }
}
