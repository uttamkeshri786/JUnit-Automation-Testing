package com.automation.test.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Constructor;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.automation.test.junit.model.Service;

class ServiceTest {

    @Test
    void ensureJSR330Constructor() {
        int count = 0;
        Constructor<?>[] constructors = Service.class.getConstructors();
        for (Constructor<?> constructor : constructors) {
            Inject annotation = constructor.getAnnotation(Inject.class);
            if (annotation != null) {
                count++;
            }
        }
        assertEquals(1, count);
    }

}
