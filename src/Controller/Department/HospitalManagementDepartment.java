/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.BillingAgentRole;
import Controller.Role.PsychiatristRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class HospitalManagementDepartment extends Department{

    public HospitalManagementDepartment() {
        super(Department.Type.HospitalManagementDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PsychiatristRole());
        roles.add(new BillingAgentRole());
        return roles;
    } 
}