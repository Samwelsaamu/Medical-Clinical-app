/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Role;

import Controller.Department.Department;
import Controller.Enterprise.Enterprise;
import Controller.HealthNGO;
import Controller.Users.Users;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public abstract class Role {
    
    public enum RoleType{
        ITAdmin("IT Admin"),//1
        WebsiteManager("Website Manager"),//2
        CommunityManager("Community Manager"),//3
        HelpDeskAgent("Help Desk Agent"),//4
        ProcessManager("Process Manager"),//5
        DonationManager("Donation Manager"),//6
        Treasurer("Treasurer"),//7
        FinanceManager("Finance Manager"),//8
        Psychiastrist("Psychiastrist"),//9
        BillingAgent("Billing Agent"),//10
        Nurse("Nurse"),//11/
        EmergencyVehicleDri("Emergency Vehicle Driver"),//12
        EmergencyMedicineDoc("Emergency Medicine Doctor"),//13
        CriticalCareManager("Critical Care Manager"),//14
        Pharmacist("Pharmacist"),//15
        DrugDeliveryAgent("Drug Delivery Agent"),//16
        PharmacyBillingAgent("Pharmacy Billing Agent"),//17
        SupplyChainManager("Supply Chain Manager"),//18
        Donar("Donar"),//19
        NGOVolunteer("NGO Volunteer"),//20
        CommunityEventsParticipants("Community Events Participants"),//21
        LifelineAgent("Lifeline Agent"),//22
        AdministrationAssistance("Administration Assistance"),//23
        NLPTrainer("NLP Trainer"),//24
        MentalHealthWarrior("Mental Health Warrior"),//25
        RehabDoctor("Rehab Doctor"),//26
        WarriorRepresentative("Warrior Representative"),//27
        SysAdmin("SysAdmin");//28
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public RoleType type;
    public abstract JPanel createWorkArea(JPanel userLoginContainer,
            JPanel userContainer, 
            Users account, 
            Department department, 
            Enterprise enterprise, 
            HealthNGO business);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
    
}