/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.NGOVolunteerRole;
import Controller.Role.ProcessManagerRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class OperationsDepartment extends Department{

    public OperationsDepartment() {
        super(Department.Type.OperationsDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProcessManagerRole());
        roles.add(new NGOVolunteerRole());
        return roles;
    } 
}