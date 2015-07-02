/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import br.com.bluesoft.vo.Banda;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jrleme
 */
@Path("/banda")
public class BandaService implements Serializable {

    private ArrayList<Banda> listaBandas;

    @Path("/getBandas")
    @Produces(MediaType.TEXT_XML)
    public ArrayList<Banda> getBandas() {
        listaBandas = new ArrayList<Banda>();
        
        Banda um = new Banda();
        um.setNome("Led Zeppelin");
        um.setId(1);
        um.setVotos(1530);
        listaBandas.add(um);

        um = new Banda();
        um.setNome("Iron Maden");
        um.setId(2);
        um.setVotos(1450);
        listaBandas.add(um);
        
        um = new Banda();
        um.setNome("Beatles");
        um.setVotos(1212);
        um.setId(3);
        listaBandas.add(um);
        
        um = new Banda();
        um.setNome("Metallica");
        um.setId(4);
        um.setVotos(934);
        listaBandas.add(um);
        
        um = new Banda();
        um.setNome("Judas Priest");
        um.setId(5);
        um.setVotos(876);
        listaBandas.add(um);
        
        um = new Banda();
        um.setNome("Black Sabbath");
        um.setId(6);
        um.setVotos(854);
        listaBandas.add(um);

        return listaBandas;
    }

    public ArrayList<Banda> getListaBandas() {
        return listaBandas;
    }

    public void setListaBandas(ArrayList<Banda> listaBandas) {
        this.listaBandas = listaBandas;
    }

}
