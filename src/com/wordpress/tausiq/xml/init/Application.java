package com.wordpress.tausiq.xml.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wordpress.tausiq.xml.service.OfferService;

public class Application {

    public static void main(String [] args) {

        // Loading spring-config
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/wordpress/tausiq/xml/spring-config.xml");

        // creating an instance based on configuration setup in spring-config
        OfferService service = applicationContext.getBean("offerServiceBean", OfferService.class);

        // using the instance
        System.out.println(service.getAll());

        // Using Constructor Injection
        OfferService service2 = applicationContext.getBean("offerServiceBean2", OfferService.class);

        System.out.println(service2.getAll());
    }
}
