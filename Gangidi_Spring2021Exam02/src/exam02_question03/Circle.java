/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question03;

/**
 *This is Circle class
 * @author Saikiran Reddy Gangidi
 */
public class Circle {
    private double radius;
/**
 * This is parameter constructor
 * @param radius  This is first parameter
 */
    public Circle(double radius) {
        this.radius = radius;
    }
/**
 * This method return radius of circle
 * @return 
 */
    public double getRadius() {
        return radius;
    }

/**
 * This method return area of circle
 * @return double return area of circle
 */   
    public double area(){
        return Math.PI*radius*radius;
    }
    /**
     * This is return circumference  of circle
     * @return double circumference  of circle
     */
    public double circumference(){
        return 2*Math.PI*radius;
    }
/**
 * This is method return complete details of circle
 * @return String return complete details of circle
 */
    @Override
    public String toString() {
        return "circle details  \nradius = " + radius + "\narea = "+area()+"\ncircumference = "+circumference();
    }
    
}
