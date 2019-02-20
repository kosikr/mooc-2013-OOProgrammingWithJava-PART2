/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafal
 */
public class Box implements Thing {

    private int maxCapacity;
    private List<Thing> list;

    public Box(int maximumCapacity) {
        this.maxCapacity = maximumCapacity;
        list = new ArrayList<Thing>();

    }

    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= this.maxCapacity) {
            list.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int helper = 0;
        for (int i = 0; i < list.size(); i++) {
            helper += list.get(i).getVolume();
        }
        return helper;
    }
}
