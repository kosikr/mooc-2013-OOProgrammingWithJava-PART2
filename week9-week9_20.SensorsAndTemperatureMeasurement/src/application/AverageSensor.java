/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafal
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;
    

    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        for (int i = 0; i < sensors.size(); i++) {
            if (sensors.get(i).isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (int i = 0; i < sensors.size(); i++) {
            sensors.get(i).on();
        }
        
    }

    @Override
    public void off() {
        for (int i = 0; i < sensors.size(); i++) {
            sensors.get(i).off();
        }
        
    }

    @Override
    public int measure() {
        if (isOn() || sensors.isEmpty()) {
            int average = 0;
            int sum = 0;
            for (int i = 0; i < sensors.size(); i++) {
                sum += sensors.get(i).measure();
            }
            average = sum / sensors.size();
            readings.add(average);
            return average;
        } else {
            throw new IllegalStateException();
        }

    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    public List<Integer> readings() {
        return readings;
    }

}
