package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController

public class Controller {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/shit")
    @ResponseBody
    public String shitString(){
//        Lấy ra dữ liệu từ API , gắn nó vào Object Quote
        Quote quote =restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random",Quote.class);
        return quote.toString();
    }
    @GetMapping("/shitObject")
    @ResponseBody
    public Object shitObject(){
//        Lấy ra dữ liệu từ API , gắn nó vào Object Quote
        Object quote =restTemplate.getForObject("http://localhost:8081/shit",Quote.class);
        return quote;
    }
}
