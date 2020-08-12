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
public class JetFactory extends AbstractFactory{

    @Override
    public Aircraft getAircraft(String aircraftType) {
        
        switch(aircraftType)
        {
            case "1":
                return new BoeingJet();
            case "2":
                return new LockheedMartinJet();
            case "3":
                return new AirbusJet();
            default:
                System.out.println("please enter a number between 1 and 3 for Jet Factory");
                break;
        }
        return null;
    }
    
}