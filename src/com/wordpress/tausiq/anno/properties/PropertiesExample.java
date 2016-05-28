package com.wordpress.tausiq.anno.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by shahab on 5/28/16.
 */
@Component("propertiesExample")
public class PropertiesExample {

    @Value("${baseURL}")
    private String baseURL;

    @Value("${interval}")
    private Integer interval;

    public String getBaseURL() {
        return baseURL;
    }

    public Integer getInterval() {
        return interval * 1000;
    }
}
