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
//this is a factory for construction of various aircraft including Cargo, Passenger, and Jet
public abstract class AbstractFactory {
    abstract Aircraft getAircraft(String aircraftType);
    
}
