/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bluesoft.mb;

import br.com.bluesoft.vo.Banda;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import resource.BandaService;

/**
 *
 * @author jrleme
 */
public class DataScrollerViewIT {
    
    public DataScrollerViewIT() {
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
     * Test of init method, of class DataScrollerView.
     */
    @Test
    public void testInit() {
        System.out.println("init");
//        DataScrollerView instance = new DataScrollerView();
//        instance.init();
//        assertEquals(instance, this);
    }

    /**
     * Test of getImageBand method, of class DataScrollerView.
     */
    @Test
    public void testGetImageBand() {
        System.out.println("getImageBand");
        int id = 0;
        DataScrollerView instance = new DataScrollerView();
        String expResult = "";
        String result = instance.getImageBand(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of sendSearch method, of class DataScrollerView.
     */
    @Test
    public void testSendSearch() {
        System.out.println("sendSearch");
        String nome = "Julio";
        String email = "julio@uol.com";
        DataScrollerView instance = new DataScrollerView();
        //instance.sendSearch(nome, email);
    }

    /**
     * Test of chooseBand method, of class DataScrollerView.
     */
    @Test
    public void testChooseBand() {
        System.out.println("chooseBand");
        int id = 2;
        DataScrollerView instance = new DataScrollerView();
        //instance.chooseBand(id);
    }

    /**
     * Test of chooseBand2 method, of class DataScrollerView.
     */
    @Test
    public void testChooseBand2() {
        System.out.println("chooseBand2");
        int id = 3;
        DataScrollerView instance = new DataScrollerView();
        //instance.chooseBand2(id);
    }

    /**
     * Test of finalization method, of class DataScrollerView.
     */
    @Test
    public void testFinalization() {
        System.out.println("finalization");
        int id = 4;
        DataScrollerView instance = new DataScrollerView();
        assertNotNull(id);
        //instance.finalization(id);
    }

    /**
     * Test of getBandas method, of class DataScrollerView.
     */
    @Test
    public void testGetBandas() {
        System.out.println("getBandas");
        DataScrollerView instance = new DataScrollerView();
        ArrayList<Banda> expResult = null;
        ArrayList<Banda> result = instance.getBandas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandas method, of class DataScrollerView.
     */
    @Test
    public void testSetBandas() {
        System.out.println("setBandas");
        ArrayList<Banda> bandas = null;
        DataScrollerView instance = new DataScrollerView();
        instance.setBandas(bandas);
    }

    /**
     * Test of getService method, of class DataScrollerView.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        DataScrollerView instance = new DataScrollerView();
        BandaService expResult = null;
        BandaService result = instance.getService();
        assertEquals(expResult, result);
    }

    /**
     * Test of setService method, of class DataScrollerView.
     */
    @Test
    public void testSetService() {
        System.out.println("setService");
        BandaService service = null;
        DataScrollerView instance = new DataScrollerView();
        instance.setService(service);
    }

    /**
     * Test of getBandChoose method, of class DataScrollerView.
     */
    @Test
    public void testGetBandChoose() {
        System.out.println("getBandChoose");
        DataScrollerView instance = new DataScrollerView();
        Banda expResult = null;
        Banda result = instance.getBandChoose();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandChoose method, of class DataScrollerView.
     */
    @Test
    public void testSetBandChoose() {
        System.out.println("setBandChoose");
        Banda bandChoose = null;
        DataScrollerView instance = new DataScrollerView();
        instance.setBandChoose(bandChoose);
    }

    /**
     * Test of getBandasAll method, of class DataScrollerView.
     */
    @Test
    public void testGetBandasAll() {
        System.out.println("getBandasAll");
        DataScrollerView instance = new DataScrollerView();
        ArrayList<Banda> expResult = null;
        ArrayList<Banda> result = instance.getBandasAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandasAll method, of class DataScrollerView.
     */
    @Test
    public void testSetBandasAll() {
        System.out.println("setBandasAll");
        ArrayList<Banda> bandasAll = null;
        DataScrollerView instance = new DataScrollerView();
        instance.setBandasAll(bandasAll);
    }

    /**
     * Test of getBandas2 method, of class DataScrollerView.
     */
    @Test
    public void testGetBandas2() {
        System.out.println("getBandas2");
        DataScrollerView instance = new DataScrollerView();
        ArrayList<Banda> expResult = null;
        ArrayList<Banda> result = instance.getBandas2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandas2 method, of class DataScrollerView.
     */
    @Test
    public void testSetBandas2() {
        System.out.println("setBandas2");
        ArrayList<Banda> bandas2 = null;
        DataScrollerView instance = new DataScrollerView();
        instance.setBandas2(bandas2);
    }

    /**
     * Test of getBandas3 method, of class DataScrollerView.
     */
    @Test
    public void testGetBandas3() {
        System.out.println("getBandas3");
        DataScrollerView instance = new DataScrollerView();
        ArrayList<Banda> expResult = null;
        ArrayList<Banda> result = instance.getBandas3();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandas3 method, of class DataScrollerView.
     */
    @Test
    public void testSetBandas3() {
        System.out.println("setBandas3");
        ArrayList<Banda> bandas3 = null;
        DataScrollerView instance = new DataScrollerView();
        instance.setBandas3(bandas3);
    }

    /**
     * Test of getBandasOrdenadas method, of class DataScrollerView.
     */
    @Test
    public void testGetBandasOrdenadas() {
        System.out.println("getBandasOrdenadas");
        DataScrollerView instance = new DataScrollerView();
        ArrayList<Banda> expResult = null;
        ArrayList<Banda> result = instance.getBandasOrdenadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandasOrdenadas method, of class DataScrollerView.
     */
    @Test
    public void testSetBandasOrdenadas() {
        System.out.println("setBandasOrdenadas");
        ArrayList<Banda> bandasOrdenadas = null;
        DataScrollerView instance = new DataScrollerView();
        instance.setBandasOrdenadas(bandasOrdenadas);
    }

    /**
     * Test of getBandasChoose method, of class DataScrollerView.
     */
    @Test
    public void testGetBandasChoose() {
        System.out.println("getBandasChoose");
        DataScrollerView instance = new DataScrollerView();
        ArrayList<Banda> expResult = null;
        ArrayList<Banda> result = instance.getBandasChoose();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandasChoose method, of class DataScrollerView.
     */
    @Test
    public void testSetBandasChoose() {
        System.out.println("setBandasChoose");
        ArrayList<Banda> bandasChoose = null;
        DataScrollerView instance = new DataScrollerView();
        instance.setBandasChoose(bandasChoose);
    }

    /**
     * Test of getNome method, of class DataScrollerView.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        DataScrollerView instance = new DataScrollerView();
        String expResult = "Julio";
        instance.setNome("Julio");
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class DataScrollerView.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        DataScrollerView instance = new DataScrollerView();
        instance.setNome(nome);
    }

    /**
     * Test of getEmail method, of class DataScrollerView.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        DataScrollerView instance = new DataScrollerView();
        String expResult = "julio@uol.com";
        instance.setEmail("julio@uol.com");
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class DataScrollerView.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        DataScrollerView instance = new DataScrollerView();
        instance.setEmail(email);
    }
    
}
