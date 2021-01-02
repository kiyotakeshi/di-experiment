package com.diExperiment.spring.di;

import com.diExperiment.commons.ProductPriceCalculator;
import com.diExperiment.commons.dao.ProductDao;
import com.diExperiment.commons.report.PriceListReport;
import org.springframework.stereotype.Service;

@Service
public class ProductPriceListReportService {

    private final ProductDao productDao;
    private final ProductPriceCalculator productPriceCalculator;
    private final PriceListReport priceListReport;

    public ProductPriceListReportService(ProductDao productDao, ProductPriceCalculator productPriceCalculator, PriceListReport priceListReport) {
        this.productDao = productDao;
        this.productPriceCalculator = productPriceCalculator;
        this.priceListReport = priceListReport;
    }

    void generateReport(){
        var products = productDao.findAll();
        var priceLists = productPriceCalculator.calculateSalaries(products);

        priceListReport.writeReport(priceLists);
    }
}
