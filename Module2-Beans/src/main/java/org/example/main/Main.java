package org.example.main;

import org.example.configuration.ProjConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjConf.class);
        Parrot p = context.getBean("stepa", Parrot.class);
        Parrot p1 = context.getBean(Parrot.class);
        System.out.println(p.getName());
        System.out.println(p1.getName());
    }
}