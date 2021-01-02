package com.diExperiment.no.di;

import com.diExperiment.commons.report.XlsPriceListReport;

public class Runner {

    public static void main(String[] args) {

        var productPriceListReportService = new ProductPriceListReportService(
                // new PdfPriceListReport()
                new XlsPriceListReport()
        );

        productPriceListReportService.generateReport();
    }
}
