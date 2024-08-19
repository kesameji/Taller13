package com.mycompany.taller13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
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
        double a = -3.0;
        double b = -5.0;
        Calculadora instance = new Calculadora();
        double expResult = -8.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
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
        double numero = 4.0;
        double indice = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;        
        //ERRO
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
        throw new IllegalArgumentException("error message");
    });
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
        double expResult = 0.16;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TCRA05() {
        System.out.println("radicacion caso 5");
        double numero = 0.0;
        double indice = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        //ERROR
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSumaDivisores() {
        System.out.println("sumaDivisores");
        int x = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

}
