package com.kiyotagbangers.diExperiment.no.di;

import com.kiyotagbangers.diExperiment.commons.report.PdfPriceListReport;
import com.kiyotagbangers.diExperiment.commons.report.XlsPriceListReport;

public class Runner {

    public static void main(String[] args) {

        ProductPriceListReportService productPriceListReportService = new ProductPriceListReportService(
                // new PdfPriceListReport()
                new XlsPriceListReport()
        );

        productPriceListReportService.generateReport();
    }
}
