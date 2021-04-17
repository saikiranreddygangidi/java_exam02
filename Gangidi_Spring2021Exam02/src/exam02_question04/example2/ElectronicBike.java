/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question04.example2;



/**
 *
 * @author S541902
 */
public class ElectronicBike extends Bike {
    String model;
    
    String name;

    public ElectronicBike(String name,String model,  String color, int rpm) {
        super(color, rpm);
        this.model = model;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        
        return super.toString()+"\nElectronicBike{" + "model=" + model + ", name=" + name + '}';
    }

  
    
}
