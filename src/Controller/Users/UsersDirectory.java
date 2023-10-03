/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Users;

import Controller.Employee.Employee;
import Controller.Network.Network;
import Controller.Role.Role;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class UsersDirectory {
    
    private ArrayList<Users> userAccountList;

    public UsersDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<Users> getUsersList() {
        return userAccountList;
    }
    
    public Users authenticateUser(String username, String password){
        for (Users ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
//    public int getPatientCount(){
//        int i=0;
//        for (Users criticalcare : userAccountList){
//            if (criticalcare.getPatient()!=null){
//                i++;
//            }
//        }  
//        return i;
//    }
    
    public Users createUser(String username, String password, Employee employee, Role role){
        Users userAccount = new Users();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setStatus("None");
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public Users createUserAccount(String username, String password, Employee employee, Role role, String firstname,String lastname,String dob,
            String sex,String address,String city,String state,int zipcode,Long contactnumber,
            String mailId,Long ssn,Long emergencycontactnumber,String emergencycontactname,String ngoid,String eventname){
        Users userAccount = new Users();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setFirstname(firstname);
        userAccount.setLastname(lastname);
        userAccount.setDob(dob);
        userAccount.setSex(sex);
        userAccount.setAddress(address);
        userAccount.setCity(city);
        userAccount.setState(state);
        userAccount.setZipcode(zipcode);
        userAccount.setPhone(contactnumber);
        userAccount.setMailId(mailId);
        userAccount.setSsnno(ssn);
        userAccount.setEmergencycontactnumber(emergencycontactnumber);
        userAccount.setEmergencycontactname(emergencycontactname);
        userAccount.setNgoid(ngoid);
        userAccount.setEventname(eventname);
        userAccount.setStatus("None");
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public Users lifelineAgent(){
        int i=1;
        for (Users users : userAccountList){
            System.out.println(users);
            if (users!=null && users.getRole().toString().equalsIgnoreCase("Lifeline Agent") && users.getStatus().equals("None")){
                if(i==1){
                    return users;
                }
                i++;
            }
        }  
        return null;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        return userAccountList.stream().noneMatch((ua) -> (ua.getUsername().equals(username)));
    }
    
            
    public boolean checkIfUsernameIsSysadmin(String userrole){
        return userrole.equals("SysAdmin");
    }
    public boolean checkIfUsernameIsHelpDeskAgent(String userrole){
        return userrole.equals("Help Desk Agent");
    }
    public boolean checkIfUsernameIsWebsiteManager(String userrole){
        return userrole.equals("Website Manager");
    }
    public boolean checkIfUsernameIsCommunityManager(String userrole){
        return userrole.equals("Community Manager");
    }
    public boolean checkIfUsernameIsProcessManager(String userrole){
        return userrole.equals("Process Manager");
    }
    public boolean checkIfUsernameIsTreasurer(String userrole){
        return userrole.equals("Treasurer");
    }
    public boolean checkIfUsernameIsFinanceManager(String userrole){
        return userrole.equals("Finance Manager");
    }
    public boolean checkIfUsernameIsPsychiastrist(String userrole){
        return userrole.equals("Psychiastrist");
    }
    public boolean checkIfUsernameIsBillingAgent(String userrole){
        return userrole.equals("Billing Agent");
    }
    public boolean checkIfUsernameIsEmergencyMedicineDoc(String userrole){
        return userrole.equals("Emergency Medicine Doctor");
    }
    public boolean checkIfUsernameIsPharmacyBillingAgent(String userrole){
        return userrole.equals("Pharmacy Billing Agent");
    }
    public boolean checkIfUsernameIsDonar(String userrole){
        return userrole.equals("Donar");
    }
    
    public boolean checkIfUsernameIsDonationManager(String userrole){
        return userrole.equals("Donation Manager");
    }
    public boolean checkIfUsernameIsNGOVolunteer(String userrole){
        return userrole.equals("NGO Volunteer");
    }
    public boolean checkIfUsernameIsCommunityEventsParticipants(String userrole){
        return userrole.equals("Community Events Participants");
    }
    public boolean checkIfUsernameIsLifelineAgent(String userrole){
        return userrole.equals("Lifeline Agent");
    }
    public boolean checkIfUsernameIsNLPTrainer(String userrole){
        return userrole.equals("NLP Trainer");
    }
    public boolean checkIfUsernameIsIT(String userrole){
        return userrole.equals("IT Admin");
    }
    
    public boolean checkIfUsernameIsPharmacist(String userrole){
        return userrole.equals("Pharmacist");
    }
    
    public boolean checkIfUsernameIsPharmacyBilling(String userrole){
        return userrole.equals("Pharmacy Billing Agent");
    }
    
    public boolean checkIfUsernameIsAdminAssistance(String userrole){
        return userrole.equals("Administration Assistance");
    }
    
    public boolean checkIfUsernameIsWarrior(String userrole){
        return userrole.equals("Mental Health Warrior");
    }
    public boolean checkIfUsernameIsWarriorRepresentative(String userrole){
        return userrole.equals("Warrior Representative");
    }
    
    public boolean checkIfUsernameIsDoctor(String userrole){
        return userrole.equals("Doctor");
    }
    
    
    public boolean checkIfUsernameIsEmergencyVehicleDriver(String userrole){
        return userrole.equals("Emergency Vehicle Driver");
    }
    
    public boolean checkIfUsernameIsDrugDeliveryAgent(String userrole){
        return userrole.equals("Drug Delivery Agent");
    }
    
    public boolean checkIfUsernameIsCriticalCare(String userrole){
        return userrole.equals("Critical Care Manager");
    }
    
    
    public boolean checkIfUsernameIsNurse(String userrole){
        return userrole.equals("Nurse");
    }
    
    
    public boolean checkIfUsernameIsSupplyChainManager(String userrole){
        return userrole.equals("Supply Chain Manager");
    }
    
    public boolean checkIfUsernameIsRehabDoctorRole(String userrole){
        return userrole.equals("Rehab Doctor");
    }
    
    
    public String sendAppointmentNotification(String receiver,String message,Network network){
        String sender=network.getSender();
        String EmailPassword=network.getEmailPassword();
        //your smtp configurations
        Properties properties =new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host",network.getSmtpHost());
        properties.put("mail.smtp.port", network.getSmtpPort());
        
        Session session=Session.getDefaultInstance(properties,new javax.mail.Authenticator(){
            @Override
           protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication(sender,EmailPassword);
           } 
        });
        
        try{
            MimeMessage notification=new MimeMessage(session);
            notification.setFrom(new InternetAddress(sender));
            notification.addRecipient(Message.RecipientType.TO,new InternetAddress(receiver));
            notification.setSubject("Appointment Email");
            notification.setText(message);
            Transport.send(notification);
            JOptionPane.showMessageDialog(null, receiver + ", will get\n" +message);
            return "Done";
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex.getMessage());
            return "Fail";
        }
    }
    
    public String sendFirstLoginNotification(String receiver,String message,Network network){
        String sender=network.getSender();
        String EmailPassword=network.getEmailPassword();
        //your smtp configurations
        Properties properties =new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host",network.getSmtpHost());
        properties.put("mail.smtp.port", network.getSmtpPort());
        
        Session session=Session.getDefaultInstance(properties,new javax.mail.Authenticator(){
            @Override
           protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication(sender,EmailPassword);
           } 
        });
        
        try{
            MimeMessage notification=new MimeMessage(session);
            notification.setFrom(new InternetAddress(sender));
            notification.addRecipient(Message.RecipientType.TO,new InternetAddress(receiver));
            notification.setSubject("New Account Created- WITH you NGO");
            notification.setText(message);
            Transport.send(notification);
            JOptionPane.showMessageDialog(null, receiver + ", will see\n" +message);
            return "Done";
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex.getMessage());
            return "Fail";
        }
    }
}