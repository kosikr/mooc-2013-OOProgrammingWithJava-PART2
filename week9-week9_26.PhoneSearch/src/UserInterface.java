/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Rafal
 */
public class UserInterface {

    private final Scanner reader;
    private final PhoneBook phonebook;

    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.phonebook = new PhoneBook();
    }

    public void start() {
        printIntro();
        programLoop();
    }

    public void printIntro() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        System.out.println();
    }

    public String command() {
        System.out.print("command: ");
        return this.reader.nextLine();
    }

    public void addNumber() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        System.out.print("number: ");
        String num = this.reader.nextLine();
        this.phonebook.add(name, num);
        System.out.println();
    }

    public void searchByName() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        this.phonebook.searchByName(name);
        System.out.println();
    }

    public void searchByNumber() {
        System.out.print("number: ");
        String number = this.reader.nextLine();

        this.phonebook.searchByNumber(number);
        System.out.println();
    }

    public void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();

        phonebook.addAddress(name, street, city);

    }

    public void removeInf() {
        System.out.print("Whose information: ");
        String name = reader.nextLine();
        this.phonebook.removeInf(name);
    }

    public void programLoop() {
        while (true) {
            try {
                int command2Int = Integer.parseInt(command());
                if (command2Int == 1) {
                    addNumber();
                } else if (command2Int == 2) {
                    searchByName();
                } else if (command2Int == 3) {
                    searchByNumber();
                } else if (command2Int == 4) {
                    addAddress();
                } else if (command2Int == 5) {
                    System.out.print("whose information: ");
                    String name = reader.nextLine();
                    Contact contact = phonebook.getFull(name);
                    if (contact != null) {
                        System.out.println(contact);
                    } else {
                        System.out.println("  not found");
                    }

                } else if (command2Int == 6) {
                    removeInf();
                } else if (command2Int == 7) {
                    System.out.print("keyword (if empty, all listed): ");
                    String searchTerm = reader.nextLine();
                    Set<Contact> contacts = phonebook.getFilteredList(searchTerm);

                    if (contacts.size() > 0) {
                        int i = 1;
                        for (Contact contact : contacts) {
                            System.out.println(" " + contact.getName());
                            System.out.println(contact);

                            // add line break unless this is the last in the set
                            if (i < contacts.size()) {
                                System.out.println();
                            }
                            i++;
                        }

                    } else {
                        System.out.println(" keyword not found");
                    }
                    break;

                }

            } catch (NumberFormatException e) {
                break;
            }

        }
    }
}
