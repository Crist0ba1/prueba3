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
public class CounterTest {
    
    public CounterTest() {
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
    public void testExisteSocio() {
        System.out.println("existeSocio");
        String rut = "123";
        Counter instance = new Counter();
        boolean expResult = true;
        boolean result = instance.existeSocio(rut);
        assertEquals(expResult, result);
    }
        @Test
    public void testExisteSocio1() {
        System.out.println("existeSocio");
        String rut = "1234";
        Counter instance = new Counter();
        boolean expResult = false;
        boolean result = instance.existeSocio(rut);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarSocio() {
        System.out.println("validarSocio");
        String rut = "";
        Counter instance = new Counter();
        int expResult = 0;
        int result = instance.validarSocio(rut);
        assertEquals(expResult, result);
    }

    @Test
    public void testCargarMulta() {
        System.out.println("cargarMulta");
        String rut = "";
        int multa = 0;
        Counter instance = new Counter();
        instance.cargarMulta(rut, multa);
        fail("The test case is a prototype.");
    }

    @Test
    public void testComprobarCancha() {
        System.out.println("comprobarCancha");
        String rut = "";
        Cancha cancha = null;
        Counter instance = new Counter();
        instance.comprobarCancha(rut, cancha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReservarCancha() {
        System.out.println("reservarCancha");
        Cancha cancha = null;
        String rut = "";
        int hora = 0;
        Counter instance = new Counter();
        instance.reservarCancha(cancha, rut, hora);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPagarMensualidad() {
        System.out.println("pagarMensualidad");
        Counter instance = new Counter();
        instance.pagarMensualidad();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPagarMulta() {
        System.out.println("pagarMulta");
        Counter instance = new Counter();
        instance.pagarMulta();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPagarDeuda() {
        System.out.println("pagarDeuda");
        Counter instance = new Counter();
        instance.pagarDeuda();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPagarTodo() {
        System.out.println("pagarTodo");
        Counter instance = new Counter();
        instance.pagarTodo();
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarSocios() {
        System.out.println("agregarSocios");
        Counter instance = new Counter();
        instance.agregarSocios();
        fail("The test case is a prototype.");
    }
    
}
