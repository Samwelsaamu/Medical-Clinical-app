/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Network;

import Controller.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class Network {
    private String name;
    private String sender,EmailPassword,smtpHost,smtpPort;
         
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getEmailPassword() {
        return EmailPassword;
    }

    public void setEmailPassword(String EmailPassword) {
        this.EmailPassword = EmailPassword;
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
    }
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
