package com.kiyotagbangers.diExperiment.commons.dao;

import com.kiyotagbangers.diExperiment.commons.entity.Product;
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
