package com.diExperiment.no.di;

import com.diExperiment.commons.businessLogic.ProductPriceCalculator;
import com.diExperiment.commons.report.PriceListReport;
import com.diExperiment.commons.dao.ProductDao;

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
        var products = this.productDao.findAll();
        var priceLists = this.productPriceCalculator.calculatePrices(products);

        this.priceListReport.writeReport(priceLists);
    }
}
