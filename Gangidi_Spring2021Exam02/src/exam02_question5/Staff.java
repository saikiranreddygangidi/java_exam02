/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question5;

/**
 *This is Staff class which extends Employee
 * @author Saikiran Reddy Gangidi
 */
public class Staff extends Employee{
    private String title;

    public Staff( String name, String address, String phonenumber, String email, String office, double salary, String dateHired,String title) {
        super(name, address, phonenumber, email, office, salary, dateHired);
        this.title = title;
    }
/**
 * This method return complete details of staff
 * @return String complete details of staff
 */
    @Override
    public String toString() {
        
        return "Staff class \nName of the person is :- "+super.getName();
    }

   
    
}
