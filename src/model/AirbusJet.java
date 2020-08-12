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
public class AirbusJet implements Aircraft{

    @Override
    public String getAircraft() {
        return "Eurofighter Typhoon";
    }

    @Override
    public String getType() {
        return "jet";
    }

    @Override
    //Capacity for Jets is hardpoints, meaning areas to load on armaments
    public int getCapacity() {
        return 13;
    }

    @Override
    public int getSpeed() {
        return 2125;
    }

    @Override
    public String getOutput() {
        String aircraft = getAircraft();
        String type = getType();
        int cap = getCapacity();
        int speed = getSpeed();
        String output = "Aircraft: " + aircraft + " Type: " + type + " Capacity (Hardpoints): " + cap + " Speed (Km/h): " + speed;
        
        return output;   
    }
}

