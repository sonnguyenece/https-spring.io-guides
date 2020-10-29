package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
private static final Logger log= LoggerFactory.getLogger(ConsumingRestApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
    }
//    A RestTemplate, which uses the Jackson JSON processing library to process the incoming data.
//  cần thằng restTemplate này, dùng thư viện Jaskson để xử lí dữ liệu JSON gửi tới
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
    return builder.build();
    }
// thằng commandLineRunner này để chạy thg RestTemplate khi spring khởi động
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate){
    return args -> {
//        Quote quote =restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random",Quote.class);
//        log.info(quote.toString());
    };
    }




}
