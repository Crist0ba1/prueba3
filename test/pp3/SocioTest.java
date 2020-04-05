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
public class SocioTest {
    
    public SocioTest() {
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
    public void testGetRut() {
        System.out.println("getRut");
        Socio instance = null;
        String expResult = "";
        String result = instance.getRut();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRut() {
        System.out.println("setRut");
        String rut = "";
        Socio instance = null;
        instance.setRut(rut);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMensualidad() {
        System.out.println("getMensualidad");
        Socio instance = null;
        int expResult = 0;
        int result = instance.getMensualidad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMensualidad() {
        System.out.println("setMensualidad");
        int mensualidad = 0;
        Socio instance = null;
        instance.setMensualidad(mensualidad);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMulta() {
        System.out.println("getMulta");
        Socio instance = null;
        int expResult = 0;
        int result = instance.getMulta();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMulta() {
        System.out.println("setMulta");
        int multa = 0;
        Socio instance = null;
        instance.setMulta(multa);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDeuda() {
        System.out.println("getDeuda");
        Socio instance = null;
        int expResult = 0;
        int result = instance.getDeuda();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDeuda() {
        System.out.println("setDeuda");
        int deuda = 0;
        Socio instance = null;
        instance.setDeuda(deuda);
        fail("The test case is a prototype.");
    }
    
}
