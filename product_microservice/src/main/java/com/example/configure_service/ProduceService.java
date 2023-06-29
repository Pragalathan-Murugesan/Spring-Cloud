package com.example.configure_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduceService {
    @Autowired
    private ProductRepo productRepo;

    public String addProducts(Dto dto) {
        Products products = new Products();
        products.setProductName(dto.getProductName());
        products.setCount(dto.getCount());
        productRepo.save(products);
        return "Product Added Successfully";
    }
}
