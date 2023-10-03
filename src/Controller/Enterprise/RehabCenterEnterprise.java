/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Enterprise;

import Controller.Department.Department;
import Controller.Role.RehabDoctorRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class RehabCenterEnterprise extends Enterprise {
    
    public RehabCenterEnterprise(String name){
        super(name,EnterpriseType.RehabCenter);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RehabDoctorRole());
        return roles;
    }
    
    @Override
    public ArrayList<Department.Type> getSupportedDepartment() {
        ArrayList<Department.Type> organizations = new ArrayList<>();
        organizations.add(Type.RehabCenterDepartment);
        return organizations;
    }
}