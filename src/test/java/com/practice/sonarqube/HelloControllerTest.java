package com.practice.sonarqube;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest
class HelloControllerTest {

    @Autowired
    HelloController helloController;


    @Test
    void home() {
        String response = helloController.home();
        Assertions.assertEquals("Hello World CI/CD", response);
    }
}