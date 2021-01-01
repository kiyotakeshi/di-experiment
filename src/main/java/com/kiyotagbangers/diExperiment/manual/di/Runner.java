package com.kiyotagbangers.diExperiment.manual.di;

import com.kiyotagbangers.diExperiment.commons.ProductPriceCalculator;
import com.kiyotagbangers.diExperiment.commons.dao.ProductDao;
import com.kiyotagbangers.diExperiment.commons.report.PdfPriceListReport;
import com.kiyotagbangers.diExperiment.commons.report.XlsPriceListReport;

public class Runner {
    public static void main(String[] args) {

        ProductPriceListReportService productPriceListReportService = new ProductPriceListReportService(
                new ProductDao(),
                new ProductPriceCalculator(),
                // new PdfPriceListReport()
                new XlsPriceListReport()
        );

        productPriceListReportService.generateReport();
    }
}
