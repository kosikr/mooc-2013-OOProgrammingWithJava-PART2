
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafal
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.get(plate) == null) {
            return false;
        }
        this.owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate key : this.owners.keySet()) {
            System.out.println(key);
        }
    }

    public void printOwners() {
        ArrayList<String> array = new ArrayList<String>();

        for (RegistrationPlate key : this.owners.keySet()) {
            String ownerName = this.owners.get(key);
            if (!array.contains(ownerName)) {
                array.add(ownerName);
            }
        }

        for (String name : array) {
            System.out.println(name);
        }
    }

}
