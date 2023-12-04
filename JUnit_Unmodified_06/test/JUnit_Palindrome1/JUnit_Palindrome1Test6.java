/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit_Palindrome1;

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
public class JUnit_Palindrome1Test6 {
    
    public JUnit_Palindrome1Test6() {
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
     * Test of methodPalindrome_1 method, of class Palindrome1.
     */
    @Test
    public void testMethodPalindrome_1() {
        System.out.println("methodPalindrome_1");
        int n1 = 78938;
        Palindrome1 instance = new Palindrome1();
        String expResult = "NOT palindrome number!";
        String result = instance.methodPalindrome_1(n1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
    }
    
}