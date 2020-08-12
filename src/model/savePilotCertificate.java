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

//saves the certificate
public class savePilotCertificate implements PilotCertificationCommandInterface{
    private Certificate certificate;

    public savePilotCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
    
    @Override
    public String commenceCertification() {
        return certificate.saveCertificate();
    }
    
}
