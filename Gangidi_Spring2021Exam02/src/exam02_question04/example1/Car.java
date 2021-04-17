/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question04.example1;

/**
 *This is Car class 
 * @author Saikiran Reddy Gangidi
 */
public class Car {
    private String name;
    private String model;
    private double prize;
    
    
    
    /**
 * This is parameter value
 * @param name This is first parameter
 * @param model This is second parameter
 * @param prize This is third parameter
 */
    public Car(String name, String model, double prize) {
        this.name = name;
        this.model = model;
        this.prize = prize;
    }
/**
 * This method return name Instance
 * @return String returns name
 */
    public String getName() {
        return name;
    }

   
/**
 * This is method returns Model instance value
 * @return String returns model value
 */
    public String getModel() {
        return model;
    }

  
/**
 * This method return prize instance Value
 * @return double return prize value
 */
    public double getPrize() {
        return prize;
    }

  

/**
 * This return complete details of car
 * @return String complete details car
 */
    
    public String toString() {
        return "Car{" + "name=" + name + ", model=" + model + ", prize=" + prize + '}';
    }
    
            
    
}
