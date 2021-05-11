/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidtest;

/**
 *
 * @author MIDO
 */
public class Pyramid implements Comparable<Pyramid>{
    String pharoh;
    String modern_name;
    String site;
    double height;
    public Pyramid(String newPharoh,String newModern_name,String newSite,double newHeight){
        this.pharoh = newPharoh;
        this.site = newSite;
        this.height = newHeight;
        this.modern_name = newModern_name;
    }
    public double getHeight(){
        return this.height;
    }
    public String getSite(){
        return this.site;
    }
    public String getModern_name(){
        return this.modern_name;
    }
    public String getPharoh(){
        return this.pharoh;
    }
    public void setHeight(double h){
        this.height=h;
    }
    public void setSite(String si){
        this.site=si;
    }
    public void setModern_name(String mn){
        this.modern_name=mn;
    }
    public void setPharoh(String p){
        this.pharoh=p;
    }
    @Override
  public int compareTo(Pyramid x)
    {
        if(this.height>x.height){
            return 1;
        }
        else if(this.height<x.height){
            return -1;
        }
        else{
            return 0;
        }
    }

}
