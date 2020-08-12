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

//this is the implementation of the adaptor that changes aircraft type to AWACS
public class AWACSAdaptorImplementation implements AWACSAdaptor{
    private Aircraft allAircraft;

    public AWACSAdaptorImplementation(Aircraft allAircraft) {
        this.allAircraft = allAircraft;
    }

    
    @Override
    public String getType() {
        return AWACSconverter(allAircraft.getType());
    }

    private String AWACSconverter(String type) {
        return "AWACS";
    }
    
}
