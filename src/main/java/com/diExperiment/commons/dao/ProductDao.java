package com.diExperiment.commons.dao;

import com.diExperiment.commons.dataStructure.Product;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ProductDao {

    public List<Product> findAll(){
        System.out.println("Finding all product");
        return Collections.emptyList();
    }
}
