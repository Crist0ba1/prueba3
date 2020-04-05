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
public class CanchaTest {
    
    public CanchaTest() {
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
    // todos parten en true
    @Test
    public void testComprobarCancha() {
        System.out.println("comprobarCancha");
        int hora = 1;
        Cancha instance = new Cancha();
        boolean expResult = true;
        boolean result = instance.comprobarCancha(hora);
        assertEquals(expResult, result);
    }
    @Test// error
    public void testComprobarCancha1() {
        System.out.println("comprobarCancha");
        int hora = 5;
        Cancha instance = new Cancha();
        boolean expResult = false;
        boolean result = instance.comprobarCancha(hora);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testCostoCancha() {
        System.out.println("costoCancha");
        int dia = 3;
        int hora = 18;
        Cancha instance = new Cancha();
        int expResult = 4000;
        int result = instance.costoCancha(dia, hora);
        assertEquals(expResult, result);
    }
    @Test
    public void testCostoCancha1() {
        System.out.println("costoCancha");
        int dia = 6;
        int hora = 18;
        Cancha instance = new Cancha();
        int expResult = 6000;
        int result = instance.costoCancha(dia, hora);
        assertEquals(expResult, result);
    }
       @Test
    public void testCostoCancha2() {
        System.out.println("costoCancha");
        int dia = 6;
        int hora = 13;
        Cancha instance = new Cancha();
        int expResult = 7000;
        int result = instance.costoCancha(dia, hora);
        assertEquals(expResult, result);
    }    
}
