package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5, calculadora.somar(2, 3));
        assertEquals(-1, calculadora.somar(-2, 1));
        assertEquals(0, calculadora.somar(0, 0));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1, calculadora.subtrair(3, 2));
        assertEquals(-3, calculadora.subtrair(0, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(0, calculadora.multiplicar(5, 0));
    }

    @Test
    public void testDividir() {
        assertEquals(2.5, calculadora.dividir(5, 2), 0.0001);
        assertEquals(-3.0, calculadora.dividir(-6, 2), 0.0001);
    }

    @Test
    public void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(5, 0);
        });
    }
}