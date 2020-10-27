package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello,%s!";

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    /**
     AtomicLong dùng để tạo số tăng dần
     Tạo file jar bằng mvn clean package
     Có thể chạy spring boot bằng lệnh:
     - mvn spring-boot:run
     - chạy intellij
     - java -jar filePath/file.jar
     */
}
