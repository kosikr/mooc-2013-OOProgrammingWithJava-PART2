
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Contact implements Comparable {

    private String name;
    private String address = "";
    private Set<String> phoneNumbers = new HashSet<String>();

    public Contact(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.address.length() > 0 ? "  address: " + address : "  address unknown");
        sb.append("\n");

        if (phoneNumbers.size() > 0) {
            sb.append("  phone numbers:\n");
            for (String phoneNumber : phoneNumbers) {
                sb.append("   " + phoneNumber);
                sb.append("\n");
            }
            sb.deleteCharAt(sb.length() - 1); // remove trailing line break

        } else {
            sb.append("  phone number not found");
        }

        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        Contact compareWith = (Contact) o;
        return name.compareTo(compareWith.getName());
    }

}
