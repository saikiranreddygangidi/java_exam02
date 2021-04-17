/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question5;

/**
 *This is Faculty class
 * @author Saikiran Reddy Gangidi
 */
public class Faculty extends Employee{
    private double office_hours ;
    private double number_of_teaching_subjects;

    public Faculty( String name, String address, String phonenumber, String email, String office, double salary, String dateHired,double office_hours, double number_of_teaching_subjects) {
        super(name, address, phonenumber, email, office, salary, dateHired);
        this.office_hours = office_hours;
        this.number_of_teaching_subjects = number_of_teaching_subjects;
    }
    /**
     * This return office hours
     * @return double office_hours
     */
    public double getOffice_hours() {
        return office_hours;
    }

   
/**
 * This method get_number_of_teaching_subjects
 * @return double number_of_teaching_subjects
 */
    public double getNumber_of_teaching_subjects() {
        return number_of_teaching_subjects;
    }

    /**
     * This method complete Faculty details
     * @return String Faculty complete 
     */
    @Override
    public String toString() {
        
                
        return "Faculty class \nName of the person is :- "+super.getName();
    }
    
    
}
