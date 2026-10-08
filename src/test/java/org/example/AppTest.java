package org.example;

import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testSum() {
        int result = Main.sum(10, 20);

        assertEquals(30, result);
    }
}