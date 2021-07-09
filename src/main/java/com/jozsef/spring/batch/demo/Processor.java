package com.jozsef.spring.batch.demo;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {

    @Override
    public String process(String input) throws Exception {
        System.out.println("Inside process");
        return "PROCESSED " + input.toUpperCase();
    }

}
