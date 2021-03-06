package com.tanb.jenkins.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsMavenSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsMavenSimpleApplication.class, args);
    }


    @RequestMapping("info")
    public String info() {
        System.out.println("jenkins");
        System.out.println("first");
        System.out.println("My Pipeline");
        return "jenkins maven simple proj.";
    }
}
