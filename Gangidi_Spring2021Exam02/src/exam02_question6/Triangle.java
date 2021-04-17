/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question6;

/**
 *This is Triangle class extends GeometricObject
 * @author Saikiran Reddy Gangidi
 */
public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    /**
     *This is parameter constructor
     * @param side1 This is first parameter
     * @param side2 This is second parameter
     * @param side3 This is third parameter
     * @param color This is fourth parameter
     * @param filled This is fifth parameter
     */
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     *This method return side1 value
     * @return
     */
    public double getSide1() {
        return side1;
    }

    /**
     *This method return side2 value
     * @return double side2 value
     */
    public double getSide2() {
        return side2;
    }

    /**
     *This method return side3 value
     * @return double side3 value
     */
    public double getSide3() {
        return side3;
    }

    /**
     *This method return perimeter of triangle
     * @return double return perimeter
     */
    public double getPerimeter(){
        return side1+side2+side3;
    }

    /**
     *This method return area of triangle
     * @return double area
     */
    public double getArea(){
        double p=getPerimeter()/2;
        return Math.pow(p*(p-side1)*(p-side2)*(p-side3),0.5);
    }

    /**
     *This return complete details of triangle
     * @return String complete details of triangle
     */
    @Override
    public String toString() {
        String result= "Area of triangle is "+getArea()+"\n";
        result+="Perimeter of triangle is "+getPerimeter()+"\n";
        result+="Color to be filled is "+getColor()+"\n";
        result+="is the triangle is be filled  "+isFilled();
        return result;
    }
          
    
    
}
