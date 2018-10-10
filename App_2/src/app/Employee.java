/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author nacho
 */
public class Employee {
    
    public String name;

    
    //Constructor
    public Employee(String name) {
        this.name = name;
    }
    
    //Getter

    public String getName() {
        return name;
    }
    
    
    //Setter

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee: "+this.name;
    }
    
    
    
    
    
    
}
