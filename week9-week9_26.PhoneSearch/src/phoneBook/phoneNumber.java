/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Rafal
 */
public class phoneNumber {
   
    private Map<String, Set<String>> record;

    public phoneNumber() {
        this.record = new HashMap<String, Set<String>>();
    }
    
    public void add(String name, String number) {
        if(!this.record.containsKey(name)) {
            this.record.put(name, new HashSet<String>());
        }
        Set<String> numbers = this.record.get(name);
        numbers.add(number);
               
        }
    public void searchByName(String searchName) {
        try {
            System.out.println(this.record.get(searchName).toString()
                    .replace("[", " ").replace(", ", "\n" + " ").replace("]", ""));
        } catch (Exception e) {
            System.out.println("  phone number not found");
        }

    }
    }
    

