package com.example.addressbook.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Contact manager class which managers the contacts
 */
public class ContactManager {
    private IContactDAO contactDAO;
    public ContactManager(IContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }


    public List<Contact> searchContacts(String query) {
        return contactDAO.getAllContacts()
                .stream()
                .filter(contact -> isContactMatched(contact, query))
                .toList();
    }

    /**
     * Method to determine if the contact searched for is present
     * @param contact - A contact object
     * @param query - string representation of the query used to search for a contact
     * @return - true if the contact is found otherwise false
     */
    private boolean isContactMatched(Contact contact, String query) {
        if (query == null || query.isEmpty()) return true;
        query = query.toLowerCase();
        String searchString = contact.getFullName()
                + " " + contact.getEmail()
                + " " + contact.getPhone();
        return searchString.toLowerCase().contains(query);
    }

    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    public void deleteContact(Contact contact) {
        contactDAO.deleteContact(contact);
    }

    public void updateContact(Contact contact) {
        contactDAO.updateContact(contact);
    }

    public List<Contact> getAllContacts() {
        return contactDAO.getAllContacts();
    }
}