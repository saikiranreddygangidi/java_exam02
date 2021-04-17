/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question5;

/**
 *This is person class
 * @author Saikiran reddy gangidi
 */
public class Person {
    private String name;
    private String address;
    private String phonenumber;
    private String email;

    /**
     *This is parameter constructor
     * @param name This is first  parameter
     * @param address this is second parameter
     * @param phonenumber this is third parameter
     * @param email this is fourth parameter
     */
    public Person(String name, String address, String phonenumber, String email) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    /**
     *This is method returns name of the person
     * @return String return name
     */
    public String getName() {
        return name;
    }

    /**
     *This method returns address of person
     * @return String return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *This is return phone number
     * @return String phoneNumber
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     *This method return email of person
     * @return String returns email
     */
    public String getEmail() {
        return email;
    }

    /**
     *This method return complete details of the person
     * @return String return complete details
     */
    @Override
    public String toString() {
        return "Person class \nName of the person is :- "+getName();
    }
    
}
