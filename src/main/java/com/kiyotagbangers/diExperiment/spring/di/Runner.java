package com.kiyotagbangers.diExperiment.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = getSpringContext("pdf-reports");
        // AnnotationConfigApplicationContext context = getSpringContext("xls-reports");
        ProductPriceListReportService productPriceListReportService = context.getBean(ProductPriceListReportService.class);
        productPriceListReportService.generateReport();

        context.close();
    }

    private static AnnotationConfigApplicationContext getSpringContext(String profile) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.register(Configuration.class);
        context.refresh();
        return context;
    }
}
