
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafal
 */
public class Box implements ToBeStored {

    private ArrayList<ToBeStored> content;
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        content = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing) {
        if (this.weight() + thing.weight() <= this.maxWeight) {
            content.add(thing);
        }
    }

    public double weight() {
        double helper = 0;
        for (ToBeStored thing : content) {
            helper += thing.weight();
        }
        return helper;
    }

    @Override
    public String toString() {
        return "Box: " + content.size() + " things, total weight " + this.weight() + " kg";
    }

}
