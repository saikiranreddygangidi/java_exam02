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
public class Bike {
    String color;
    int rpm;

    public Bike(String color, int rpm) {
        this.color = color;
        this.rpm = rpm;
    }

    public String getColor() {
        return color;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return "Bike{" + "color=" + color + ", rpm=" + rpm + '}';
    }
    
}
