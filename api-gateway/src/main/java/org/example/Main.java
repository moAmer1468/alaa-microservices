package org.example;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

@EnableDiscoveryClient
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("This is the api-gateway");
        SpringApplication.run(Main.class, args);
    }
}