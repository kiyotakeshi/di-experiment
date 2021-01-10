package com.diExperiment.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = getSpringContext("pdf-reports");
        // AnnotationConfigApplicationContext context = getSpringContext("xls-reports");
        var productPriceListReportService = context.getBean(ProductPriceListReportService.class);

        productPriceListReportService.generateReport();

        System.out.println("\n--------- all custom defined beans in our applicationContext container ---------");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames)
                .filter(name -> !name.contains("org.springframework.context"))
                .forEach(System.out::println);

        context.close();
    }

    private static AnnotationConfigApplicationContext getSpringContext(String profile) {
        var context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.register(AppConfig.class);
        // context.scan("com.diExperiment"); // if you don't use AppConfig class
        context.refresh();
        return context;
    }
}
