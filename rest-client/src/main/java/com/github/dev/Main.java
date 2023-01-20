package com.github.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@SpringBootApplication(scanBasePackages = "com.github.dev.*")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}