package com.diExperiment.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = getSpringContext("pdf-reports");
        // AnnotationConfigApplicationContext context = getSpringContext("xls-reports");
        var productPriceListReportService = context.getBean(ProductPriceListReportService.class);
        productPriceListReportService.generateReport();

        context.close();
    }

    private static AnnotationConfigApplicationContext getSpringContext(String profile) {
        var context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.register(Configuration.class);
        context.refresh();
        return context;
    }
}
