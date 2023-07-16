/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.test.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mithila
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int no1 = 2;
        int no2 = 3;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAddNegative() {
        System.out.println("add");
        int no1 = -2;
        int no2 = -10;
        Calculator instance = new Calculator();
        int expResult = -12;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);
        
    }
    
}
