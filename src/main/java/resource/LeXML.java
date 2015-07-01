/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import br.com.bluesoft.vo.Banda;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author jrleme
 */
public class LeXML {

    //public static void main(String[] args) {
    public void leXML(){

        ArrayList<Banda> bandas = new ArrayList<Banda>();
        int HTTP_COD_SUCESSO = 200;

        try {
            URL url = new URL("http://localhost:8080/Bluemusic/resource/banda/getBandas");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            if (con.getResponseCode() != HTTP_COD_SUCESSO) {
                throw new RuntimeException("HTTP error code : " + con.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
            JAXBContext jaxbContext;
            jaxbContext = JAXBContext.newInstance(Banda.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Banda banda = (Banda) jaxbUnmarshaller.unmarshal(br);
            System.out.println("------ Lista de Bandas -------- \n");
//            for (Banda banda : bandas) {
                System.out.println("Nome da Banda : " + banda.getNome());
//            }
            con.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException ex) {
            Logger.getLogger(BandaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
