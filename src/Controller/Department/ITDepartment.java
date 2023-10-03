/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.ITAdminRole;
import Controller.Role.Role;
import Controller.Role.WebsiteManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class ITDepartment extends Department{

    public ITDepartment() {
        super(Department.Type.ITDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WebsiteManagerRole());
        roles.add(new ITAdminRole());
        return roles;
    } 
}