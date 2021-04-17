/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question08.example2;

/**
 *
 * @author S541902
 */
public abstract class Gun {
    private String color;
    private double width;

    public Gun(String color, double width) {
        this.color = color;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }
    public abstract void firing_speed();

    @Override
    public String toString() {
        return "Gun{" + "color=" + color + ", width=" + width + '}';
    }
    
}
