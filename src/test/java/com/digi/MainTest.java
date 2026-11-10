package com.digi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testCalcularAhorro() {

        double resultado = Main.calcularAhorro(5, 20);

        assertEquals(100.0, resultado);
    }
}
