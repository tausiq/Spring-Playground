package com.wordpress.tausiq.anno.init;

import com.wordpress.tausiq.anno.properties.PropertiesExample;
import com.wordpress.tausiq.anno.scope.PrototypeScope;
import com.wordpress.tausiq.anno.scope.SingletonScope;
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

        // Singleton scope
        SingletonScope singletonScope = applicationContext.getBean("singletonScope", SingletonScope.class);
        System.out.println(singletonScope);

        SingletonScope singletonScope2 = applicationContext.getBean("singletonScope", SingletonScope.class);
        System.out.println(singletonScope2);

        SingletonScope singletonScope3 = applicationContext.getBean("singletonScope", SingletonScope.class);
        System.out.println(singletonScope3);

        // Prototype scope
        PrototypeScope prototypeScope = applicationContext.getBean("prototypeScope", PrototypeScope.class);
        System.out.println(prototypeScope);

        PrototypeScope prototypeScope2 = applicationContext.getBean("prototypeScope", PrototypeScope.class);
        System.out.println(prototypeScope2);

        PrototypeScope prototypeScope3 = applicationContext.getBean("prototypeScope", PrototypeScope.class);
        System.out.println(prototypeScope3);

        // Properties example
        PropertiesExample propertiesExample = applicationContext.getBean("propertiesExample", PropertiesExample.class);
        System.out.println(propertiesExample.getBaseURL());
        System.out.println(propertiesExample.getInterval());
    }
}
