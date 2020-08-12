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
public class DisplayPilotUpdateObserver implements PilotUpdateObserver{
    
    @Override
    public void onStaffUpdate(Pilot pilot) {
        System.out.println("New Pilot: '" + pilot.getPilotName() + "'");
        
    }
    
}
