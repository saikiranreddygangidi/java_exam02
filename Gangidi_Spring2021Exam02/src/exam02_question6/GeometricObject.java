/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question6;

/**
 *This is GeometricObject class
 * @author S541902
 */
public abstract class GeometricObject {
    private String color;
    private boolean filled;
/**
 * This is parameter constructor
 * @param color This is first parameter
 * @param filled This is second parameter
 */
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
/**
 * This method is return color value
 * @return String color
 */
    public String getColor() {
        return color;
    }

   
/**
 * This method say whether it is shape is filled or not
 * @return Boolean return filled value
 */
    public boolean isFilled() {
        return filled;
    }

   /**
    * This is abstract method
    * @return double return area
    */
    public abstract double getArea();
    
    /**
    * This is abstract method
    * @return double return perimeter
    */
    public abstract double getPerimeter();
    
}
