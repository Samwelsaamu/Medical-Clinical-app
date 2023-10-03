/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.AdministrationAssistanceRole;
import Controller.Role.NLPTrainerRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class AdministrationDepartment extends Department{

    public AdministrationDepartment() {
        super(Department.Type.Administration.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdministrationAssistanceRole());
        roles.add(new NLPTrainerRole());
        return roles;
    } 
}