package com.kiyotagbangers.diExperiment.spring.di;

import com.kiyotagbangers.diExperiment.commons.ProductPriceCalculator;
import com.kiyotagbangers.diExperiment.commons.dao.ProductDao;
import com.kiyotagbangers.diExperiment.commons.entity.PriceList;
import com.kiyotagbangers.diExperiment.commons.entity.Product;
import com.kiyotagbangers.diExperiment.commons.report.PriceListReport;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<Product> products = productDao.findAll();
        List<PriceList> priceLists = productPriceCalculator.calculateSalaries(products);

        priceListReport.writeReport(priceLists);
    }
}
