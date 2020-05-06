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
public class employee {
    
    public String name;
    public int ID;
    public String dob;
    public String startDate;
    public double salary;
    public String email;
    public String address;
    public int password;
    
    public employee(String name, int ID, String dob, String startDate ,double salary, String email, String address, int password){
    
        this.name=name;
        this.ID= ID;
        this.dob=dob;
        this.startDate=startDate;
        this.salary=salary;
        this.email=email;
        this.address=address;
        this.password=password;
        
        
    }
    public String getEmployee(){
    
        return "password : "+this.password+ "\nname : "+this.name+ "\nID : "+this.ID+"\nDate of birth : "+this.dob+"\nStart date : "
                +this.startDate+ "\nsalary : "+this.salary+ "\nemail : "+this.email+ "\naddress : "+this.address;
    }
}