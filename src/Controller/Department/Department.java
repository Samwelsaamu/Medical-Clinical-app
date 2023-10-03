/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Donations.DonationDirectory;
import Controller.Employee.EmployeeDirectory;
import Controller.Events.EventDirectory;
import Controller.Events.EventParticipantDirectory;
import Controller.Medicine.MedicineDirectory;
import Controller.Role.Role;
import Controller.Users.UsersDirectory;
import Controller.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public abstract class Department {

    private String name;

    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UsersDirectory userAccountDirectory;
    private MedicineDirectory medicinedirectory;
    private DonationDirectory donationDirectory;
    private EventDirectory eventsDirectory;
    private EventParticipantDirectory eventsParticipantsDirectory;
    
    public enum Type{
        Administration("Administration Department"),CommunityManagement("Community Management Department"),
        CriticalCareDepartment("Critical Care Department"),CriticalResponseDepartment("Critical Response Department"),
        EmergencyDepartment("Emergency Department"),FinanceDepartment("Finance Department"),
        HospitalManagementDepartment("Hospital Management Department"), ITDepartment("IT Department"),
        OperationsDepartment("Operations Department"), PatientCareDepartment("Patient Care Department"),
        PharmaceuticalsSupplyChainDepart("Pharmaceuticals Supply Chain Depart"),
        PharmacyBillingDepartment("Pharmacy Billing Department"),PharmacyDepartment("Pharmacy Department"),
        SupportDepartment("Support Department"),RehabCenterDepartment("Rehab Center Department");
        private String value;
        private Type(String value) {
            
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Department(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UsersDirectory();
        medicinedirectory=new MedicineDirectory();
        donationDirectory=new DonationDirectory();
        eventsDirectory=new EventDirectory();
        eventsParticipantsDirectory=new EventParticipantDirectory();
    }
    
    public Department() {
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UsersDirectory();
        medicinedirectory=new MedicineDirectory();
        donationDirectory=new DonationDirectory();
        eventsDirectory=new EventDirectory();
        eventsParticipantsDirectory=new EventParticipantDirectory();
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UsersDirectory getUsersDirectory() {
        return userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public MedicineDirectory getMedicinedirectory() {
        return medicinedirectory;
    }
    
    public DonationDirectory getDonationDirectory() {
        return donationDirectory;
    }
    public EventDirectory getEventDirectory() {
        return eventsDirectory;
    }
    
    public EventParticipantDirectory getEventParticipantDirectory() {
        return eventsParticipantsDirectory;
    }
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}