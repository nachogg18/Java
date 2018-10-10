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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Employee empleado1 = new Employee("Carlos López");
        Employee empleado2 = new Employee("Juan Fernández");
        Employee empleado3 = new Employee("Lucas Flores");
        Airplane avion1 = new Airplane("Boeing 747",9800);
        Airplane avion2 = new Airplane("Airbus 380",11000);
        Team equipo1 = new Team(1);
        equipo1.addEmployee(empleado3);
        equipo1.addEmployee(empleado2);
        Team equipo2 = new Team(2);
        Component ala = new Component("Ala","A1");
        Component aleta=new Component("Aleta","Aa1");
        Component turbina =new Component("Turbina","T1");
        turbina.showComponent();
        avion1.addPart(ala);
        avion1.addPart(turbina);
        Component helice1 =new Component("Hélice 1","H1",turbina);
        helice1.showComponent();
        Component helice2 =new Component("Hélice 2","H2",turbina);
        Component helice3 =new Component("Helice 3","H3",turbina);
        Component motor =new Component("Motor","M1",turbina);
        turbina.showComponent();
        ala.showComponent();
        ala.removeComponent(aleta);
        ala.showComponent();
        ala.assignTo(avion1);
        System.out.println(turbina.isFrom());
        equipo1.addSubTeam(equipo2);
        equipo1.showSubTeams();
        equipo1.removeSubTeam(equipo2);
        equipo2.addEmployee(empleado1);
        equipo2.showEmployees();
        equipo2.removeEmployee(empleado1);
        equipo2.addAirplane(avion1);
        equipo1.addAirplane(avion2);
        equipo1.showAirplanes();
        equipo1.removeAirplane(avion2);
        equipo1.showAirplanes();
        equipo2.showAirplanes();
        equipo2.removeAirplane(avion1);
        equipo2.showAirplanes();
        equipo1.showEmployees();
        equipo1.addEmployee(empleado2);
        System.out.println(helice3.isFrom().toString());
        
        
        
    }
    
}
