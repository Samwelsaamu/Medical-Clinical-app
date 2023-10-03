/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.PharmacyBillingAgentRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class PharmacyBillingDepartment extends Department{

    public PharmacyBillingDepartment() {
        super(Department.Type.PharmacyBillingDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyBillingAgentRole());
        return roles;
    } 
}