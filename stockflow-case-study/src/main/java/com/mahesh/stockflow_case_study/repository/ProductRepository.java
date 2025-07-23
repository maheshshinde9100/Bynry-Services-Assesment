package com.mahesh.stockflow_case_study.repository;


import com.mahesh.stockflow_case_study.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByQuantityLessThan(int threshold);
}
