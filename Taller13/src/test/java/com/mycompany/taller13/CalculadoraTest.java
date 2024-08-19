package com.mycompany.taller13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testSuma() {
        System.out.println("suma");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplicacion1() {
        System.out.println("multiplicacion");
        double a = 4.0;
        double b = -2.0;
        Calculadora instance = new Calculadora();
        double expResult = -8.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMultiplicacion2() {
        System.out.println("multiplicacion");
        double a = 4.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMultiplicacion3() {
        System.out.println("multiplicacion");
        double a = -2.0;
        double b = -4.0;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMultiplicacion4() {
        System.out.println("multiplicacion");
        double a = 4.0;
        double b = 2.5;
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMultiplicacion5() {
        System.out.println("multiplicacion");
        double a = 10000000000000.00;
        double b = 0.000000000001;
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivision1() {
        System.out.println("division");
        double a = 1.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivision2() {
        System.out.println("division");
        double a = -4.0;
        double b = -2.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivision3() {
        System.out.println("division");
        double a = 10000000000000.00;
        double b = 0.000000000001;
        Calculadora instance = new Calculadora();
        double expResult = 1.e+25;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivision4() {
        System.out.println("division");
        double a = 1.0;
        double b = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.3333333333333333;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivision5() {
        System.out.println("division");
        double a = 3.5;
        double b = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 1.75;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
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

    @Test
    public void testSumaDivisores() {
        System.out.println("sumaDivisores");
        int x = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
