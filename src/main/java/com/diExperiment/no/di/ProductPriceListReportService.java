package com.diExperiment.no.di;

import com.diExperiment.commons.ProductPriceCalculator;
import com.diExperiment.commons.report.PriceListReport;
import com.diExperiment.commons.dao.ProductDao;

public class ProductPriceListReportService {

    private final PriceListReport priceListReport;

    public ProductPriceListReportService(PriceListReport priceListReport) {
        this.priceListReport = priceListReport;
    }

    void generateReport(){
        var productDao = new ProductDao();
        var products = productDao.findAll();

        var productPriceCalculator = new ProductPriceCalculator();
        var priceLists = productPriceCalculator.calculatePrices(products);

        // not using DI
        // var pdfPriceListReport = new PdfPriceListReport();
        // pdfPriceListReport.writeReport(priceLists);
        // var xlsPriceListReport = new XlsPriceListReport();
        // xlsPriceListReport.writeReport(priceLists);

        // using DI
        this.priceListReport.writeReport(priceLists);
    }
}
