
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class PhoneBook {

    private Map<String, Contact> number;

    public PhoneBook() {
        number = new HashMap<String, Contact>();

    }

    public void add(String name, String number) {
        if (!this.number.containsKey(name)) {
            this.number.put(name, new Contact(name));
        }
        this.number.get(name).addPhoneNumber(number);

    }

    public void searchByName(String searchName) {
        if (this.number.containsKey(searchName)) {
            System.out.println(this.number.get(searchName));
        } else {
            System.out.println("  phone number not found");
        }
    }

    public void searchByNumber(String searchNumber) {

        for (String key : this.number.keySet()) {
            if (this.number.get(key).getPhoneNumbers().contains(searchNumber)) {
                System.out.println(key);
            } else {
                System.out.println(" not found");
            }

        }
    }

    public void addAddress(String name, String street, String city) {
        if (!this.number.containsKey(name)) {
            this.number.put(name, new Contact(name));
        }
        this.number.get(name).setAddress(street + " " + city);
    }

    public Contact getFull(String name) {
        return this.number.get(name);
    }

    public void removeInf(String name) {
        this.number.remove(name);
    }

    public Set<Contact> getFilteredList(String searchTerm) {
        Set<Contact> matches = new TreeSet<Contact>();

        for (String key : number.keySet()) {
            Contact contact = number.get(key);
            if (contact.getName().contains(searchTerm) || contact.getAddress().contains(searchTerm) || searchTerm.equals("")) {
                matches.add(contact);
            }
        }

        return matches;
    }

}
