package com.diExperiment.spring.di;

import com.diExperiment.commons.businessLogic.ProductPriceCalculator;
import com.diExperiment.commons.dao.ProductDao;
import com.diExperiment.commons.report.PriceListReport;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductPriceListReportService {

    private final ProductDao productDao;
    private final ProductPriceCalculator productPriceCalculator;
    private final PriceListReport priceListReport;

    public ProductPriceListReportService(ProductDao productDao, ProductPriceCalculator productPriceCalculator,
                                         // @Qualifier("pdfPriceListReport")
                                         // @Qualifier("xlsPriceListReport")
                                         PriceListReport priceListReport) {
        this.productDao = productDao;
        this.productPriceCalculator = productPriceCalculator;
        this.priceListReport = priceListReport;
    }

    void generateReport() {
        var products = productDao.findAll();
        var priceLists = productPriceCalculator.calculatePrices(products);

        this.priceListReport.writeReport(priceLists);
    }
}
