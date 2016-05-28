package com.wordpress.tausiq.anno.init;

import com.wordpress.tausiq.anno.service.OfferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String [] args) {

        // Loading spring-config
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/wordpress/tausiq/anno/spring-config.xml");

        // creating an instance based on configuration setup in spring-config
        // The first param name will be the value you game on the implementation
        OfferService service = applicationContext.getBean("offerService", OfferService.class);

        // using the instance
        System.out.println(service.getAll());
    }
}
