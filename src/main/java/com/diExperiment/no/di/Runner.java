package com.diExperiment.no.di;

import com.diExperiment.commons.businessLogic.ProductPriceCalculator;
import com.diExperiment.commons.dao.ProductDao;
import com.diExperiment.commons.report.XlsPriceListReport;

public class Runner {

    public static void main(String[] args) {

        var productPriceListReportService = new ProductPriceListReportService(
                new ProductDao(),
                new ProductPriceCalculator(),
                // new PdfPriceListReport()
                new XlsPriceListReport()
        );

        productPriceListReportService.generateReport();
    }
}
