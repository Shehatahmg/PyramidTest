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
        Collections.sort(pyramids);
        //Uncomment this part if you want to view the sorted list
        //int i=0;
//        for (Pyramid p : pyramids){
//            System.out.println("#"+(i++)+" "+p.getPharoh()+" "+p.getModern_name()+" "+p.getSite()+" "+p.getHeight());
//        }
        
        Map <String,Integer>pyramidMap = new HashMap<String,Integer>();
        // Inetiazlizing the map
        for (Pyramid p : pyramids){
            pyramidMap.put(p.getSite(),0);
            }
        //Looping on the keys and counting the values of the keys in the pyramids list
        pyramidMap.forEach((k,v)->{
            pyramidMap.put(k,siteCount(pyramids,k));
                });
        // Printing the Pyramids site count HashMap
        pyramidMap.forEach((k, v) -> System.out.println("Pyramid=" + k + ", Number of pyramids=" + v));
        }
    // A method to count the number of pyramids in a site 
    public static  Integer siteCount( List<Pyramid> ps,String s){
        int count=0;       
        for (Pyramid p : ps){
            if(p.getSite().equalsIgnoreCase(s)){
              count++;  
            }
        }
        return count;
    }
}
