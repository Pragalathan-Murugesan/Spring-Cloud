package com.example.home_microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/homepage")
public class Controller {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HomeService homeService;
    @GetMapping("/gethome")
    public String home(){
        String homeq =  restTemplate.getForObject("http://product-microservice/product/getall",String.class);
        return homeq;
    }
    @PostMapping("/addproducts")
    public String addProducts(@RequestBody Dto dto){
        return homeService.addProducts(dto);
    }
}
