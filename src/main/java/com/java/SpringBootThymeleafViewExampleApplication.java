package com.java;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@SpringBootApplication
@EnableJpaAuditing
public class SpringBootThymeleafViewExampleApplication 
{
public static void main(String[] args) 
{
SpringApplication.run(SpringBootThymeleafViewExampleApplication.class, args);
}
}