package com.diExperiment.commons;

import com.diExperiment.commons.entity.PriceList;
import com.diExperiment.commons.entity.Product;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ProductPriceCalculator {

    public List<PriceList> calculatePrices(List<Product> products){
        System.out.println("Calculating product prices");
        return Collections.emptyList();
    }
}
