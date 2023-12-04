/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit_Palindrome2;

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
public class JUnit_Palindrome2Test6 {
    
    public JUnit_Palindrome2Test6() {
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
     * Test of methodPalindrome_2 method, of class Palindrome2.
     */
    @Test
    public void testMethodPalindrome_2() {
        System.out.println("methodPalindrome_2");
        String original = "nababan";
        Palindrome2 instance = new Palindrome2();
        String expResult = "palindrome string!";
        String result = instance.methodPalindrome_2(original);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

