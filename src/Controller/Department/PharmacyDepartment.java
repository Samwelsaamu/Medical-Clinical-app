/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.DrugDeliveryAgentRole;
import Controller.Role.PharmacistRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class PharmacyDepartment extends Department{

    public PharmacyDepartment() {
        super(Department.Type.PharmacyDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacistRole());
        roles.add(new DrugDeliveryAgentRole());
        return roles;
    } 
}