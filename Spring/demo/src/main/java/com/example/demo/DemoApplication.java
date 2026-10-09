package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// RUN WITH COMMAND .\gradlew.bat bootRun
@SpringBootApplication
@RestController
public class DemoApplication {
    
    public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    }
    
    
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    return String.format("Hello %s!", name);
    }
    @Configuration
    public class WebConfig implements WebMvcConfigurer {
        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/").setViewName("forward:/index.html");
        }
    }
}