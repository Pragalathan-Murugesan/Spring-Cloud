package com.example.home_microservice;

import org.apache.http.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {
    @Autowired
    private RestTemplate restTemplate;
    public String addProducts(Dto dto) {
        HttpEntity<Dto> entity = new HttpEntity<>(dto);
     String  response = String.valueOf(restTemplate.postForEntity("http://product-microservice/product/addproducts", entity, String.class));
        return response;
    }
}
