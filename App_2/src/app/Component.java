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
public class Component {
    
    private String name;
    
    private String value;
    
    private Component[] subassembly=new Component[100];
    
    private  final Component assembly;
    
    private Airplane is;
    
    private int contadorComponent=0;
    
    
    //Constructores

    /*Es el constructor utilizado para crear Componentes
    que forman parte de otros 
                  componentes*/
    public Component(String name,String value,Component assembly) {
        this.name=name;
        this.value = value;
        this.assembly = assembly;
        assembly.addComponent(this);
        
    }
    
    /*Es el constructor utilizado para crear Componentes
    principales de los aviones*/
    
    public Component(String name,String value) {
        this.name = name;
        this.value = value;
     
        this.assembly = null;
        
    }
    
    
    
    
    //Getter

    public String getValue() {
        return value;
    }

    public Component getAssembly() {
        return assembly;
    }

    public Airplane getIs() {
        return is;
    }
    
    
    
    //Setter

    public void setValue(String value) {
        this.value = value;
    }

    
    
    //toString

    @Override
    public String toString() {
       return "Component: "+name+" ,value: "+value;
    }
    
    /*agrega un subcomponente al 
        componente actual  */
    
    public void addComponent(Component component) {
        this.subassembly[contadorComponent]=component;
        contadorComponent++;
    }
    
    
    /*elimina un subcomponente
        al componente actual */
    
    public boolean removeComponent(Component component) {
        boolean resultado = false;
        for (int i = 0; i < contadorComponent; i++) {
            if (subassembly[i] == component) {
                for (int j = i; j < contadorComponent - 1; j++) {
                    subassembly[j] = subassembly[j+1];
                }
                subassembly[contadorComponent - 1] = null;
                resultado = true;
            }
        }
        return resultado;
    }

        
    /*Muestra una lista de los componentes actuales*/
    
    
    public void showComponent() {
        if (subassembly[0]==null) {
            System.out.println("No components registered");
        }
        else {
            for (int i = 0; i<contadorComponent; i++)  {
                if (subassembly[i]!=null)
                    System.out.println(i+1+"-"+subassembly[i].toString());
            }   
        }
    }
    
    
    /*Retorna el Avión del que forma parte el componente */
    
    public Airplane isFrom() {
        if (assembly!=null) {
            return this.getAssembly().isFrom();
        }
        
        else {
            return this.is;
        }
        
        
    } 
    
    public void assignTo(Airplane airplane) throws Exception {
        if (assembly==null) {
            this.is =airplane;
        }
        
        else {
            throw new Exception("The super part already is asigned");
        }
        
    }
    
    
    
    
    
    
    
    
    
    
}
