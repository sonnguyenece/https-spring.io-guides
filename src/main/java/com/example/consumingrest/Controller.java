package com.example.consumingrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController

public class Controller {
    @GetMapping("/shit")
    @ResponseBody
    public String shit(){
        System.out.println("shit");
        RestTemplate restTemplate =new RestTemplate();
        Quote quote =restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random",Quote.class);
        return quote.toString();
    }
}
