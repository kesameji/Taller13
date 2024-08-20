package com.mycompany.taller13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
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
        double a = 3.0;
        double b = -3.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
       // fail("The test case is a prototype.");
    }

    @Test
    public void TCS04() {
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
        //fail("The test case is a prototype.");

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
    public void TCE01() {
        System.out.println("exponenciacion caso 1");
        double base = 2.0;
        double exponente = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 4.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TCE02() {
        System.out.println("exponenciacion caso 2");
        double base = 2.0;
        double exponente = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TCE03() {
        System.out.println("exponenciacion caso 3");
        double base = 2.0;
        double exponente = -2.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.25;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    @DisplayName("")
    public void TCE04() {
        System.out.println("exponenciacion caso 4");
        double base = -4.0;
        double exponente = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 16.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TCE05() {
        System.out.println("exponenciacion caso 5");
        double base = 2.25;
        double exponente = 4.0;
        Calculadora instance = new Calculadora();
        double expResult = 25.6289;
        double result = instance.exponenciacion(base, exponente);
        
        assertEquals(expResult, result, 0.001);
        //fail("The test case is a prototype.");
    }

    @Test
    public void TCRA01() {
        System.out.println("radicacion caso 1");
        double numero = 4.0;
        double indice = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TCRA02() {
        System.out.println("radicacion caso 2");
        double numero = -4.0;
        double indice = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TCRA03() {
        System.out.println("radicacion caso 3");
        double numero = 0.0;
        double indice = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;        
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TCRA04() {
        System.out.println("radicacion caso 4");
        double numero = 0.4;
        double indice = 0.5;
        Calculadora instance = new Calculadora();
        double expResult = 0.16000000000000003;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0.001);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TCRA05() {
        System.out.println("radicacion caso 5");
        double numero = 4.0;
        double indice = -2.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.5;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void TCNA01() {
        System.out.println("sonAmigos");
        int a = 220;
        int b = 284;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void TCNA02() {
        System.out.println("sonAmigos");
        int a = 12;
        int b = 18;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void TCNA03() {
        System.out.println("sonAmigos");
        int a = -2;
        int b = 4;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void TCNA04() {
        System.out.println("sonAmigos");
        int a = 7;
        int b = 11;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void TCNA05() {
        System.out.println("sonAmigos");
        int a = 1;
        int b = 1;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void TCNA06() {
        System.out.println("sonAmigos");
        int a = 4;
        int b = 2;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
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
