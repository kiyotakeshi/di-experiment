package com.diExperiment.commons.report;

import com.diExperiment.commons.dataStructure.PriceList;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("pdf-reports")
public class PdfPriceListReport implements PriceListReport {

    @Override
    public void writeReport(List<PriceList> priceLists) {
        System.out.println("Making Pdf Reports");
    }
}
