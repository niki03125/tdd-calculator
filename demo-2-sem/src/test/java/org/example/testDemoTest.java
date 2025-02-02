package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testDemoTest {
    testDemo instance = new testDemo();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test of return value equals Hello!")
    void testDemo(){
        String actual = instance.sayHello();
        assertEquals("Hello!",actual);
    }

}