package com.diExperiment.commons.businessLogic;

import com.diExperiment.commons.dataStructure.PriceList;
import com.diExperiment.commons.dataStructure.Product;
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
