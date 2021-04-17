/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question5;

/**
 This is Student class which extends Person class
 * @author Saikiran Reddy Gangidi
 */
public class Student extends Person{
    private double grade;
    private final String STATUS="Graduate";

    public Student( String name, String address, String phonenumber, String email,double grade) {
        super(name, address, phonenumber, email);
        this.grade = grade;
    }
/**
 * This method return grade
 * @return double returns grade
 */
    public double getGrade() {
        return grade;
    }

   /**
    * This method return STATUS 
    * @return String return Status
    */
    public String getSTATUS(){
        return STATUS;
    }
/**
 * This method return complete details of Student
 * @return String complete of Student
 */
    @Override
    public String toString() {
        return "Student class \nName of the person is :- "+super.getName();
    }
    
}
