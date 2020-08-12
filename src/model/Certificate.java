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

//this is the Receiver
public class Certificate {
    
    private String pilot;

    public Certificate(String pilot) {
        this.pilot = pilot;
    }
    
    public String createCertificate()
    {
        return "Creating Pilot Certificate for: " + pilot;
    }
    
    public String saveCertificate()
    {
        return "Saving Pilot Certificate for: " + pilot;
    }
}
