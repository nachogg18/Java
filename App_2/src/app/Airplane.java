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
public class Airplane {
    
    private String id;
    
    private int autonomy;
    
    public  Team by;
    
    private Component[] has;
    
    private int contadorPartes;
    

    public Airplane(String id,int autonomy) {
        this.id = id;
        this.autonomy = autonomy;
        has=new Component[100];
        contadorPartes = 0;
        
    }
    
    
    //Getter

    public String getId() {
        return id;
    }
    
    public int getAutonomy() {
        return autonomy;
    }

    //Setter

    public void setId(String id) {
        this.id = id;
    }

    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }
    
    
    public void addPart(Component component) {
        has[contadorPartes]=component;
        contadorPartes++;
    }
    
    public boolean removePart(Component component) {
        boolean resultado = false;
        for (int i = 0; i < contadorPartes; i++) {
            if (has[i] == component) {
                for (int j = i; j < contadorPartes - 1; j++) {
                    has[j] = has[j+1];
                }
                has[contadorPartes - 1] = null;
                resultado = true;
            }
        }
        return resultado;
    }
    
    
    
    
    
    public void compositeFrom() {
        if (has[0]==null)
            System.out.println("Without parts assembled");
        else {
            for (int i = 0 ; i<contadorPartes ; i++) 
                System.out.println(i+1+"-"+has[contadorPartes]);
            
        }
    }
    
    
    public Team madeBy() {
        return by;
    }
    
    private void setTeam(Team team) {
        by.removeAirplane(this);
        by=team;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Airplane : "+this.id+" ,autonomy : "+this.autonomy+" km";
    }
    
    
    
    
    
    
}
