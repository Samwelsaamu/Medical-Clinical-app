/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.CriticalCareManagerRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class CriticalCareDepartment extends Department{

    public CriticalCareDepartment() {
        super(Department.Type.CriticalCareDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CriticalCareManagerRole());
        return roles;
    } 
}