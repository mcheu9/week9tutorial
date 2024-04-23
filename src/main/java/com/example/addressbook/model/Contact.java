package com.example.addressbook.model;

/**
 * Class Comment: Class to represent Contact object in the address book application
 */

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    /**
     * Comment: Constructor for Contact class to create new contact object
     * @param firstName - first name of contact
     * @param lastName - last name of contact
     * @param email - email of contact
     * @param phone - phone number of contact
     */
    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Comment: Getter for the ID of a contact object
     * @return - an integer representing the ID for the contact
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}