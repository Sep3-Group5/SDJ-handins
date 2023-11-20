package com.example.slaughterhousepart3.service;

import com.example.slaughterhousepart3.repository.AnimalPartRepository;
import com.example.slaughterhousepart3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    // methods
}
