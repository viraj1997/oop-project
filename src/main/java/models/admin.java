/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author DV
 */
public class admin {
    
    public String eName;
    public double eID;
    
    
    public admin(String eName, double eID){
    
        this.eName = eName;
        this.eID = eID;
    
    }
    
    public String getAdmin(){
    
           return "employee name : "+this.eName+ "employee ID : "+this.eID;
    
    }
}
