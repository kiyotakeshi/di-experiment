package com.diExperiment.commons.report;

import com.diExperiment.commons.entity.PriceList;

import java.util.List;

public interface PriceListReport {
    void writeReport(List<PriceList> priceLists);
}
