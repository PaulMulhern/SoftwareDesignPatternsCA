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
//this is the invoker class for the command pattern
public class PilotCertificationInvoker {
    
    private List<PilotCertificationCommandInterface> 
            pilotCerts = new ArrayList<>();
    
    public String commenceCertification
        (PilotCertificationCommandInterface pilotCert)
        {
            pilotCerts.add(pilotCert);
            return pilotCert.commenceCertification();
        }
            
    
}
