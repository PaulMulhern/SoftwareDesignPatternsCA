/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author spart
 */
public class AirbusCargo implements Aircraft{

    @Override
    public String getAircraft() {
        return "Airbus Beluga";
    }

    @Override
    public String getType() {
        return "cargo";
    }

    @Override
    //Capacity is in Kg
    public int getCapacity() {
        return 47000;
    }

    @Override
    public int getSpeed() {
        return 864;
    }

    @Override
    public String getOutput() {
        String aircraft = getAircraft();
        String type = getType();
        int cap = getCapacity();
        int speed = getSpeed();
        String output = "Aircraft: " + aircraft + " Type: " + type + " Capacity (Kg): " + cap + " Speed (Km/h): " + speed;
        
        return output;   
    }
}
