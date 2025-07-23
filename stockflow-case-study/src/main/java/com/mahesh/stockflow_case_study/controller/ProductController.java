package com.mahesh.stockflow_case_study.controller;

import com.mahesh.stockflow_case_study.model.Product;
import com.mahesh.stockflow_case_study.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/low-stock")
    public ResponseEntity<List<Product>> getLowStockProducts(@RequestParam int minStockLevel) {
        List<Product> lowStock = service.getLowStockProducts(minStockLevel);
        return ResponseEntity.ok(lowStock);
    }
}
