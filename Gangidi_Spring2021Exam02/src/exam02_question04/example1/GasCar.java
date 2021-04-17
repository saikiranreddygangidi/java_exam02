/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question04.example1;

/**
 *This is GasCar class
 * @author Saikiran Reddy Gangidi
 */
public class GasCar extends Car{
      private double gasCapacity;

    /**
     *This is parameter constructor
     * @param name This is first parameter
     * @param model This is second parameter
     * @param prize This is third parameter
     * @param gascapacity This is fourth parameter
     */
    public GasCar(String name, String model, double prize,double gasCapacity) {
        super(name, model, prize);
        this.gasCapacity=gasCapacity;
    }

    /**
     *This is method return gas capacity
     * @return double return gasCapacity
     */
    public double getGasCapacity() {
        return gasCapacity;
    }

   

    @Override
    public String toString() {
        String result=super.toString()+"\n";
        return result+"GasCar{" + "gasCapacity=" + gasCapacity + '}';
    }
}
