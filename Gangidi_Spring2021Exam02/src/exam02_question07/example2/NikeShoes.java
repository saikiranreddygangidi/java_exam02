/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question07.example2;

/**
 *This is Enum Class
 * @author Saikiran Reddy Gangidi
 */
public enum NikeShoes {
    BLAZER(100,"white"),VAPORMAX(150,"blue");
    double prize;
    String color;

    private NikeShoes(double prize,String color) {
        this.prize = prize;
    }
    public double getPrize(){
        return prize;
    }
     public String getcolor(){
        return color;
    }
}
