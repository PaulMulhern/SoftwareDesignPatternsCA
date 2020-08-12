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
public class LockheedMartinAirliner implements Aircraft{

    @Override
    public String getAircraft() {
        return "Lockheed L-1011 TriStar";
    }

    @Override
    public String getType() {
        return "passenger";
    }

    @Override
    public int getCapacity() {
        return 256;
    }

    @Override
    public int getSpeed() {
        return 620;
    }

    @Override
    public String getOutput() {
        String aircraft = getAircraft();
        String type = getType();
        int cap = getCapacity();
        int speed = getSpeed();
        String output = "Aircraft: " + aircraft + " Type: " + type + " Capacity (passengers): " + cap + " Speed (Km/h): " + speed;
        
        return output;        }
}
