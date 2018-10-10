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
public class Team {
    
    public int number;
    
    private Team[] subTeam;
    
    private int contadorGenerico;
    
    private int contadorTeam;
    
    private int contadorEmployee;
    
    private int contadorAirplane;
    
    private Employee[] has;
    
    private Airplane[] builds;

    /* Se crea equipo con numero identificatorio,
    a partir de otros equipos,
    para construir un conjunto de aviones 
    */
    
    public Team(int number) {
        subTeam = new Team[100];
        contadorTeam = 0;
        contadorEmployee = 0;
        contadorAirplane = 0;
        this.number = number;
        has = new Employee[100];
        builds = new Airplane[100];
    }
    
    public void addSubTeam(Team team) {
        this.subTeam[contadorTeam]=team;
        contadorTeam++;
    }
    
    public boolean removeSubTeam(Team team) {
        boolean resultado = false;
        for (int i = 0; i < contadorTeam; i++) {
            if (subTeam[i] == team) {
                for (int j = i; j < contadorTeam - 1; j++) {
                    subTeam[j] = subTeam[j+1];
                }
                subTeam[contadorTeam - 1] = null;
                resultado = true;
            }
        }
        return resultado;
    }
        
    
    
    public void showSubTeams() {
        if (subTeam[0]==null) 
            System.out.println("There isn't subteams  registered");
        else {
            System.out.println("------SubTeams----------");
            for (int i= 0; i < contadorTeam ; i++) {
                System.out.println(i+1+"-"+subTeam[i].toString());
                
            }
        }    
    }
    
    public void addEmployee(Employee employee) {
        if (this.isIn(employee, contadorEmployee, has)) 
            System.out.println("Already registered");
        
        else {
            this.has[contadorEmployee]=employee;
            contadorEmployee++;
            System.out.println("OK");
        }
    }
    
    public boolean removeEmployee(Employee employee) {
        boolean resultado = false;
        for (int i = 0; i < contadorEmployee; i++) {
            if (has[i] == employee) {
                for (int j = i; j < contadorEmployee - 1; j++) {
                    has[j] = has[j+1];
                }
                has[contadorEmployee -1] = null;
                resultado = true;
            }
        }
        return resultado;
    }
    
    public void showEmployees() {
        if (has[0]==null) 
            System.out.println("There aren't Employees  registered without subteams");
        else {
            System.out.println("------Employees----------");
            for (int i= 0; i < contadorEmployee ; i++) {
                System.out.println(i+1+"-"+has[i].toString());
                
            }
        }    
    }
        
    public void addAirplane(Airplane airplane) {
        if (this.isIn(airplane, contadorEmployee, has)) 
            System.out.println("Already registered");
        else {
            this.builds[contadorAirplane]=airplane;
            contadorAirplane++;
            System.out.println("OK");
        }
    }
    public boolean removeAirplane(Airplane airplane) {
        boolean resultado = false;
        for (int i = 0; i < contadorAirplane; i++) {
            if (builds[i] == airplane) {
                for (int j = i; j < contadorAirplane - 1; j++) {
                    builds[j] = builds[j+1];
                }
                builds[contadorAirplane -1] = null;
                resultado = true;
            }
        }
        return resultado;
    }
    
        public void showAirplanes() {
        if (builds[0]==null) 
            System.out.println("There isn't airplanes  registered");
        else {
            System.out.println("------Airplanes----------");
            for (int i= 0; i < contadorAirplane ; i++) {
                System.out.println(i+1+"-"+builds[i].toString());
                
            }
        }    
    }
    
        
    public boolean isIn(Object object,int contador,Object[] array) {
        for (int i=0;i<contador;i++) {
            if (array[i] == object)
                return true;
        }
        return false;
    }
    
        
    @Override
    public String toString() {
         return "Team: "+this.number;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
 

}
    
    
    
    
    
    
    
    
    
    
    
    


