/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidtest;
import java.util.*;
import java.io.*;

/**
 *
 * @author MIDO
 */
public class PyramidTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("F:\\Iti\\Foundation period\\Java & UML programming\\Lecs\\pyramids.csv");
        int i=0;
        Collections.sort(pyramids);
        for (Pyramid p : pyramids){
            System.out.println("#"+(i++)+" "+p.getPharoh()+" "+p.getModern_name()+" "+p.getSite()+" "+p.getHeight());
        }
    }
}
