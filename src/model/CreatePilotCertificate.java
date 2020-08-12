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

//creates the certificate
public class CreatePilotCertificate implements PilotCertificationCommandInterface{

    private Certificate certificate;

    public CreatePilotCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
    
    @Override
    public String commenceCertification() {
        return certificate.createCertificate();
    }
    
}
