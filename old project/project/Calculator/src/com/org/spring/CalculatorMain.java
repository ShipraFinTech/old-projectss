package com.org.spring;


import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CalculatorMain {
    public static void main(String[] args) throws Exception {

        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/src/com/org/spring/applicationContext.xml");
        Inuput inuput = context.getBean(Inuput.class);
        inuput.calculateData();
        context.close();

    }
}
