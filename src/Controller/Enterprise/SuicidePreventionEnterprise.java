/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Enterprise;

import Controller.Department.Department;
import Controller.Role.AdministrationAssistanceRole;
import Controller.Role.LifelineAgentRole;
import Controller.Role.NLPTrainerRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class SuicidePreventionEnterprise extends Enterprise {
    
    public SuicidePreventionEnterprise(String name){
        super(name,EnterpriseType.SuicidePrevention);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LifelineAgentRole());
        roles.add(new AdministrationAssistanceRole());
        roles.add(new NLPTrainerRole());
        return roles;
    }
    
    @Override
    public ArrayList<Department.Type> getSupportedDepartment() {
        ArrayList<Department.Type> organizations = new ArrayList<>();
        organizations.add(Type.CriticalResponseDepartment);
        organizations.add(Type.Administration);
        return organizations;
    }
}