package com.example.configure_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class Controller{
    @Autowired
    private ProduceService produceService;
    @GetMapping("/getall")
    public String getAllProducts(){
        return "Get ALL Product List";
    }

    @PostMapping("/addproducts")
    public String addProducts(@RequestBody Dto dto){
        return produceService.addProducts(dto);
    }
}