package net.dmly.part1.quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Quoter bean = context.getBean(Quoter.class);
        bean.sayQuote();
    }
}
