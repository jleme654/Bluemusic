/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bluesoft.mb;

/**
 *
 * @author jrleme
 */
import resource.BandaService;
import br.com.bluesoft.vo.Banda;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "dataScrollerView")
@SessionScoped
public class DataScrollerView implements Serializable {

    private ArrayList<Banda> bandasOrdenadas;
    private ArrayList<Banda> bandasAll;
    private ArrayList<Banda> bandas;
    private ArrayList<Banda> bandas2;
    private ArrayList<Banda> bandas3;
    private ArrayList<Banda> bandasChoose;
    private Banda bandChoose;
    private String nome;
    private String email;
    private BandaService service;
   
    @PostConstruct
    public void init() {
        bandChoose = new Banda();
        bandasChoose = new ArrayList<Banda>();
        service = new BandaService();
        bandasAll  = service.getBandas();
        
        bandas = new ArrayList<Banda>();
        bandas.add(bandasAll.get(0));
        bandas.add(bandasAll.get(1));
        bandasChoose.add(bandasAll.get(1));
        
        bandas2 = new ArrayList<Banda>();
        bandas2.add(bandasAll.get(2));
        bandas2.add(bandasAll.get(3));
        bandasChoose.add(bandasAll.get(2));
        
        bandas3 = new ArrayList<Banda>();
        bandas3.add(bandasAll.get(4));
        bandas3.add(bandasAll.get(5));
        bandasChoose.add(bandasAll.get(5));
    }

    public String getImageBand(int id) {
        //String pathAbsolute = FacesContext.getCurrentInstance().getExternalContext().getApplicationContextPath();
        //System.out.println("Caminho absoluto da aplicacao: "+pathAbsolute);
        StringBuilder sb = new StringBuilder();
        switch (id) {
            case 1:
                sb.append("/WEB-INF");
                sb.append("/resources/images/led.jpg");
                return sb.toString();
            case 2:
                sb.append("/WEB-INF");
                sb.append("/resources/images/iron.jpg");
                return sb.toString();
            case 3:
                sb.append("/WEB-INF");
                sb.append("/resources/images/beatles.jpg");
                return sb.toString();
            case 4:
                sb.append("/WEB-INF");
                sb.append("/resources/images/metallica.jpg");
                return sb.toString();
            case 5:
                sb.append("/WEB-INF");
                sb.append("/resources/images/judas.jpg");
                return sb.toString();
            case 6:
                sb.append("/WEB-INF");
                sb.append("/resources/images/black.jpg");
                return sb.toString();
        }
        return "";
    }
    
    public void sendSearch(String nome, String email){
        try {
            setEmail(email);
            setNome(nome);
            FacesContext.getCurrentInstance().getExternalContext().redirect("sent.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(DataScrollerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void chooseBand(int id){
        try {
            bandChoose.setId(id);
            FacesContext.getCurrentInstance().getExternalContext().redirect("pesquisa2.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(DataScrollerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void chooseBand2(int id){
        try {
            bandChoose.setId(id);
            FacesContext.getCurrentInstance().getExternalContext().redirect("pesquisa3.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(DataScrollerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public void finalization(int id){
        try {
            bandChoose.setId(id);
            FacesContext.getCurrentInstance().getExternalContext().redirect("finalization.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(DataScrollerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Banda> getBandas() {
        return bandas;
    }

    public void setBandas(ArrayList<Banda> bandas) {
        this.bandas = bandas;
    }

    public BandaService getService() {
        return service;
    }

    public void setService(BandaService service) {
        this.service = service;
    }

    public Banda getBandChoose() {
        return bandChoose;
    }

    public void setBandChoose(Banda bandChoose) {
        this.bandChoose = bandChoose;
    }

    public ArrayList<Banda> getBandasAll() {
        return bandasAll;
    }

    public void setBandasAll(ArrayList<Banda> bandasAll) {
        this.bandasAll = bandasAll;
    }

    public ArrayList<Banda> getBandas2() {
        return bandas2;
    }

    public void setBandas2(ArrayList<Banda> bandas2) {
        this.bandas2 = bandas2;
    }

    public ArrayList<Banda> getBandas3() {
        return bandas3;
    }

    public void setBandas3(ArrayList<Banda> bandas3) {
        this.bandas3 = bandas3;
    }

    public ArrayList<Banda> getBandasOrdenadas() {
        try {
            bandasOrdenadas = bandasAll;
            int count = 0;
            for (Banda b : bandasAll) {
                int posicao1 = b.getId();
                int posicao2 = b.getId()+1;
                b.setId(posicao1);

                Banda b2 = new Banda();
                b2.setId(posicao2);

                if (b.getVotos() > b2.getVotos()) {
                    bandasOrdenadas.set(count, b);
                    bandasOrdenadas.add(b);
                    count++;
                }
            }
     
        } catch (Exception e) {
        }
        return bandasOrdenadas;
    }

    public void setBandasOrdenadas(ArrayList<Banda> bandasOrdenadas) {
        this.bandasOrdenadas = bandasOrdenadas;
    }

    public ArrayList<Banda> getBandasChoose() {
        return bandasChoose;
    }

    public void setBandasChoose(ArrayList<Banda> bandasChoose) {
        this.bandasChoose = bandasChoose;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
