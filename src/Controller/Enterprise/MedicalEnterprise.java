/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Enterprise;

import Controller.Department.Department;
import Controller.Role.BillingAgentRole;
import Controller.Role.CriticalCareManagerRole;
import Controller.Role.EmergencyMedicineDoctorRole;
import Controller.Role.EmergencyVehicleDriverRole;
import Controller.Role.NurseRole;
import Controller.Role.PsychiatristRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class MedicalEnterprise extends Enterprise {
    
    public MedicalEnterprise(String name){
        super(name,EnterpriseType.Medical);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PsychiatristRole());
        roles.add(new NurseRole());
        roles.add(new BillingAgentRole());
        roles.add(new EmergencyVehicleDriverRole());
        roles.add(new EmergencyMedicineDoctorRole());
        roles.add(new CriticalCareManagerRole());
        return roles;
    }
    
    @Override
    public ArrayList<Department.Type> getSupportedDepartment() {
        ArrayList<Department.Type> organizations = new ArrayList<>();
        organizations.add(Type.CriticalCareDepartment);
        organizations.add(Type.HospitalManagementDepartment);
        organizations.add(Type.PatientCareDepartment);
        organizations.add(Type.EmergencyDepartment);
        return organizations;
    }
}