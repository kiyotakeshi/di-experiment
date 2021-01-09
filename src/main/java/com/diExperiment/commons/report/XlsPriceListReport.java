package com.diExperiment.commons.report;

import com.diExperiment.commons.dataStructure.PriceList;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("xls-reports")
public class XlsPriceListReport implements PriceListReport {

    @Override
    public void writeReport(List<PriceList> priceLists) {
        System.out.println("Making Xls Reports");
    }
}
