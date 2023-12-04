/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit_Reverse2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class JUnit_Reverse2Test3 {
    
    public JUnit_Reverse2Test3() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of methodReverse_2 method, of class Reverse2.
     */
    @Test
    public void testMethodReverse_2() {
        System.out.println("methodReverse_2");
        String original = "isi";
        Reverse2 instance = new Reverse2();
        String expResult = "The reverse of "+original+" is is";
        String result = instance.methodReverse_2(original);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

