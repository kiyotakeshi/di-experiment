package com.kiyotagbangers.diExperiment.commons.report;

import com.kiyotagbangers.diExperiment.commons.entity.PriceList;

import java.util.List;

public interface PriceListReport {
    void writeReport(List<PriceList> priceLists);
}
