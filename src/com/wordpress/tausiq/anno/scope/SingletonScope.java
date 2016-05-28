package com.wordpress.tausiq.anno.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by shahab on 5/28/16.
 */
@Component("singletonScope")
@Scope("singleton")
public class SingletonScope {

}
