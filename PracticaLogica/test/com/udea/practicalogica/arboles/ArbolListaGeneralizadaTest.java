/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udea.practicalogica.arboles;

import com.udea.practicalogica.arboles.listageneralizada.NodoLista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sony vaio
 */
public class ArbolListaGeneralizadaTest {
    
    public ArbolListaGeneralizadaTest() {
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
     * Test of agregar method, of class ArbolListaGeneralizada.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        ArbolListaGeneralizada instance = new ArbolListaGeneralizada();
        NodoLista expResult = null;
        NodoLista result = instance.agregar(null,null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregar method, of class ArbolListaGeneralizada.
     */
    @Test
    public void testAgregarRaiz() {
        System.out.println("agregar");
        ArbolListaGeneralizada<String> instance = new ArbolListaGeneralizada<String>();
        NodoLista expResult = new NodoS("soy la raiz");
        NodoLista result = instance.agregar(null,expResult);
        //assertEquals(expResult.dato, result.dato);
        assertEquals(instance.raiz.dato, result.dato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAgregarHijoRaiz() {
        System.out.println("agregar");
        ArbolListaGeneralizada<String> instance = new ArbolListaGeneralizada<String>();
        NodoLista raiz = instance.agregar(null,new NodoS("soy la raiz"));
        
        NodoLista expResult = new NodoS("soy el primer hijo");
        NodoLista result = instance.agregar(raiz,expResult);
        //assertEquals(expResult.dato, result.dato);
        NodoLista primerHijo = instance.raiz.liga;
        assertEquals(primerHijo.dato, result.dato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAgregarHermanoHijoRaiz() {
        System.out.println("agregar");
        ArbolListaGeneralizada<String> instance = new ArbolListaGeneralizada<String>();
        NodoLista raiz = instance.agregar(null,new NodoS("soy la raiz"));
        NodoLista primerHijo = instance.agregar(raiz,new NodoS("soy el primer hijo"));
        
        
        
        NodoLista expResult = new NodoS("soy el hermano del primer hijo");
        NodoLista result = instance.agregar(raiz,expResult);
        //assertEquals(expResult.dato, result.dato);
        NodoLista hermanoHijo = instance.raiz.liga.liga;
        assertEquals(hermanoHijo.dato, result.dato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of elimina method, of class ArbolListaGeneralizada.
     */
    @Test
    public void testElimina() {
        System.out.println("elimina");
        Object dato = null;
        ArbolListaGeneralizada instance = new ArbolListaGeneralizada();
        boolean expResult = false;
        boolean result = instance.elimina(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mover method, of class ArbolListaGeneralizada.
     */
    @Test
    public void testMover() {
        System.out.println("mover");
        ArbolListaGeneralizada instance = new ArbolListaGeneralizada();
        boolean expResult = false;
        boolean result = instance.mover(null,null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ArbolListaGeneralizada.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Object dato = null;
        ArbolListaGeneralizada instance = new ArbolListaGeneralizada();
        NodoLista expResult = null;
        NodoLista result = instance.buscar(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornPadre method, of class ArbolListaGeneralizada.
     */
    @Test
    public void testRetornPadre_GenericType() {
        System.out.println("retornPadre");
        Object dato = null;
        ArbolListaGeneralizada instance = new ArbolListaGeneralizada();
        NodoLista expResult = null;
        NodoLista result = instance.retornPadre(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornPadre method, of class ArbolListaGeneralizada.
     */
    @Test
    public void testRetornPadre_NodoLista() {
        System.out.println("retornPadre");
        ArbolListaGeneralizada instance = new ArbolListaGeneralizada();
        NodoLista expResult = null;
        NodoLista result = instance.retornPadre(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public class NodoS extends NodoLista<String>{

        public NodoS(String dato) {
            super(dato);
        }

        @Override
        public int compareTo(String t) {
            return this.dato.compareTo(t);
        }

        
    
    
    }
    
}
