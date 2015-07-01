/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bluesoft.service;

import resource.BandaService;
import br.com.bluesoft.vo.Banda;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jrleme
 */
public class BandaServiceIT {
    
    public BandaServiceIT() {
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
     * Test of getBandas method, of class BandaService.
     */
    @Test
    public void testGetBandas() {
        System.out.println("getBandas");
        BandaService instance = new BandaService();
        ArrayList<Banda> expResult = new ArrayList<Banda>();
        ArrayList<Banda> result = new ArrayList<Banda>(); 
        assertEquals(expResult, result);
    }
    
}
