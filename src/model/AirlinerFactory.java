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
public class AirlinerFactory extends AbstractFactory {

    @Override
    public Aircraft getAircraft(String aircraftType) {
        
        switch(aircraftType)
        {
            case "1":
                return new BoeingAirliner();
            case "2":
                return new LockheedMartinAirliner();
            case "3":
                return new AirbusAirliner();
            default:
                System.out.println("please enter a number between 1 and 3 for Airliner");
                break;
        }
        return null;
    }
    
}
