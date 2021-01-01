package com.kiyotagbangers.diExperiment.no.di;

import com.kiyotagbangers.diExperiment.commons.ProductPriceCalculator;
import com.kiyotagbangers.diExperiment.commons.dao.ProductDao;
import com.kiyotagbangers.diExperiment.commons.entity.PriceList;
import com.kiyotagbangers.diExperiment.commons.entity.Product;
import com.kiyotagbangers.diExperiment.commons.report.PdfPriceListReport;
import com.kiyotagbangers.diExperiment.commons.report.PriceListReport;
import com.kiyotagbangers.diExperiment.commons.report.XlsPriceListReport;

import java.util.List;

public class ProductPriceListReportService {

    private final PriceListReport priceListReport;

    public ProductPriceListReportService(PriceListReport priceListReport) {
        this.priceListReport = priceListReport;
    }

    void generateReport(){
        ProductDao productDao = new ProductDao();
        List<Product> products = productDao.findAll();

        ProductPriceCalculator productPriceCalculator = new ProductPriceCalculator();
        List<PriceList> priceLists = productPriceCalculator.calculateSalaries(products);

        // not using DI
        // PdfPriceListReport pdfPriceListReport = new PdfPriceListReport();
        // pdfPriceListReport.writeReport(priceLists);
        // XlsPriceListReport xlsPriceListReport = new XlsPriceListReport();
        // xlsPriceListReport.writeReport(priceLists);

        // using DI
        priceListReport.writeReport(priceLists);
    }
}
