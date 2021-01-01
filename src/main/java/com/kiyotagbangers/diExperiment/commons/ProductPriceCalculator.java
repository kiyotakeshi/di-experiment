package com.kiyotagbangers.diExperiment.commons;

import com.kiyotagbangers.diExperiment.commons.entity.PriceList;
import com.kiyotagbangers.diExperiment.commons.entity.Product;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ProductPriceCalculator {

    public List<PriceList> calculateSalaries(List<Product> products){
        System.out.println("Calculating product prices");
        return Collections.emptyList();
    }
}
