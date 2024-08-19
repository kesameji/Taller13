package com.mycompany.taller13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author CltControl
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }
    // SUMA
    @Test
    public void TCS01() {
        System.out.println("suma");
        double a = -3.0;
        double b = -5.0;
        Calculadora instance = new Calculadora();
        double expResult = -8.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    @Test
    public void TCS02() {
        System.out.println("suma");
        double a = 1.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
       // fail("The test case is a prototype.");
    }
    @Test
    public void TCS03() {
        System.out.println("suma");
        double a = 1.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = a;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
       // fail("The test case is a prototype.");
    }

    @Test
    public void TCS04() {
        System.out.println("suma");
        double a = 3.0;
        double b = -3.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
      //  fail("The test case is a prototype.");
    }
    @Test
    public void TCS05() {
        System.out.println("suma");
        double a = 1.2;
        double b = 2.004;
        Calculadora instance = new Calculadora();
        double expResult = 3.204;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0.001);
       // fail("The test case is a prototype.");
    }
    
    // RESTA
    @Test
    public void TCR01() {
        System.out.println("resta");
        double a = 5.0;
        double b = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 3.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
       // fail("The test case is a prototype.");
    }
    @Test
    public void TCR02() {
        System.out.println("resta");
        double a = 5.0;
        double b = 5.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
       // fail("The test case is a prototype.");
    }
    @Test
    public void TCR03() {
        System.out.println("resta");
        double a = 5.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = a;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
       // fail("The test case is a prototype.");
    }
    @Test
    public void TCR04() {
        System.out.println("resta");
        double a = 2.56;
        double b = 1.9;
        Calculadora instance = new Calculadora();
        double expResult = 0.66;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0.01);
       // fail("The test case is a prototype.");
    }

    
    
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testExponenciacion() {
        System.out.println("exponenciacion");
        double base = 0.0;
        double exponente = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRadicacion() {
        System.out.println("radicacion");
        double numero = 0.0;
        double indice = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSonAmigos() {
        System.out.println("sonAmigos");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    // SUMA DIVISORES
    @Test
    public void TCSD01 () {
        System.out.println("sumaDivisores");
        int x = 6;
        Calculadora instance = new Calculadora();
        int expResult = 6;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    @DisplayName("Suma Divisores para números primos")
    @Test
    public void TCSD02 () {
        System.out.println("sumaDivisores");
        int x = 7;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    @DisplayName("Cuadrados perfectos")
    @Test
    public void TCSD03 () {
        System.out.println("sumaDivisores");
        int x = 25;
        Calculadora instance = new Calculadora();
        int expResult = 6;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @DisplayName("Suma Divisores para 0 y 1")
    @Test
    public void TCSD04 () {
        System.out.println("sumaDivisores");
        int x = 1;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @DisplayName("Suma Divisores para números negativos")
    @Test
    public void TCSD05 () {
        System.out.println("sumaDivisores");
        int x = -3;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

}
