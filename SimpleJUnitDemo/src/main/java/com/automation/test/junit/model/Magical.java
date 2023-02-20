package com.automation.test.junit.model;

/*
 * public interface Magical {
 * 
 * }
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})  
@Retention(RetentionPolicy.RUNTIME)
public @interface Magical {
    // your code goes here 
}
