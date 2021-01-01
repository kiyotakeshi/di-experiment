package com.kiyotagbangers.diExperiment.commons.report;

import com.kiyotagbangers.diExperiment.commons.entity.PriceList;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("xls-reports")
public class XlsPriceListReport implements com.kiyotagbangers.diExperiment.commons.report.PriceListReport {

    @Override
    public void writeReport(List<PriceList> priceLists) {
        System.out.println("Making Xls Reports");
    }
}
