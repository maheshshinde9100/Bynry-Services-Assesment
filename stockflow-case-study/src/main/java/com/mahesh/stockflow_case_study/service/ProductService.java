package com.mahesh.stockflow_case_study.service;


import com.mahesh.stockflow_case_study.model.*;
import  com.mahesh.stockflow_case_study.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getLowStockProducts(int minStockLevel) {
        return repo.findByQuantityLessThan(minStockLevel);
    }
}
