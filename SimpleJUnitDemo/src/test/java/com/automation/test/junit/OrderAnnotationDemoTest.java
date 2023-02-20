package com.automation.test.junit;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class OrderAnnotationDemoTest {

    @Test
    @Order(1)
    void firstOne() {
        // test something here
    }

    @Test
    @Order(2)
    void secondOne() {
        // test something here
    }

}
