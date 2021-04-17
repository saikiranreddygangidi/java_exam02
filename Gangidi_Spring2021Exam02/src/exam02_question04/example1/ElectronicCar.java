/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question04.example1;

/**
 *
 * @author S541902
 */
public class ElectronicCar extends Car{
   private double chargeCapacity;

    /**
     *This is parameter constructor
     * @param name This is first parameter
     * @param model This is second parameter
     * @param prize This is third parameter
     * @param chargecapacity This is fourth parameter
     */
    public ElectronicCar(String name, String model, double prize,double chargeCapacity) {
        super(name, model, prize);
        
        this.chargeCapacity=chargeCapacity;
        
    }

    /**
     *This method return chargeCapacity
     * @return double return chargeCapacity
     */
    public double getChargeCapacity() {
        return chargeCapacity;
    }

  

    /**
     *This return complete detail of Electronic car
     * @return String complete details of Electronic car
     */
    @Override
    public String toString() {
        String result=super.toString()+"\n";
        return result+"ElectronicCar{" + "chargeCapacity=" +getChargeCapacity()   + "watts}";
    }
   
}
