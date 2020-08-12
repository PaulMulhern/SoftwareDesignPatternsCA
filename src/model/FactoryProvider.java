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
public class FactoryProvider {
    public static AbstractFactory getAircraftFactory(String FactoryType)
    {
        switch (FactoryType) {
            case "1":
                return new AirlinerFactory();
            case "2":
                return new JetFactory();
            case "3":
                return new CargoFactory();
            default:
                break;
        }
        return null;
    }
    
}
