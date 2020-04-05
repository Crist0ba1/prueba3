/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crist
 */
public class RestaurantTest {
    
    public RestaurantTest() {
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

    @Test
    public void testDescuento() {
        System.out.println("descuento");
        Restaurant instance = new Restaurant(5000);
        int expResult = 4500;
        int result = instance.descuento();
        System.out.println("result "+result);
        assertEquals(expResult, result);
    }
        @Test
    public void testDescuento1() {
        System.out.println("descuento");
        Restaurant instance = new Restaurant(10000);
        int expResult = 9000;
        int result = instance.descuento();
        System.out.println("result "+result);
        assertEquals(expResult, result);
    }
    
}
