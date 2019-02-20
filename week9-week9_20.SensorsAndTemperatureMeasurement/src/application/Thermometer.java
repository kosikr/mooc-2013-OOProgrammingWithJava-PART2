/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Rafal
 */
public class Thermometer implements Sensor {

    private Random random;
    private boolean status;

    public Thermometer() {
        status = false;
        random = new Random();
    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void on() {
        status = true;
    }

    @Override
    public void off() {
        status = false;
    }

    @Override
    public int measure() {
        if (status) {
            int temp = -30 + random.nextInt((30 - (-30)) + 1);
            return temp;
        } else {
            throw new IllegalStateException();
        }
    }

}
