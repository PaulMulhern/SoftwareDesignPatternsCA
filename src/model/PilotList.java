/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author spart
 */
public class PilotList {
    private List<Pilot> pilotList = new ArrayList<>();
    private List<PilotUpdateObserver> observerList = new ArrayList<>();
    
    public void updatePilotList(Pilot pilot)
    {
        this.pilotList.add(pilot);
        this.notifyObservers(pilot);
    }
    
    public void addObserver(PilotUpdateObserver obsvr)
    {
        this.observerList.add(obsvr);
    }
    
    public void removeObserver(PilotUpdateObserver obsvr)
    {
        this.observerList.remove(obsvr);
    }
    
    public void notifyObservers(Pilot pilot) {
        this.observerList.forEach(observer -> observer.onStaffUpdate(pilot));
    }
    
    
}
