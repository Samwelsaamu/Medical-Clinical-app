/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Role;

import Controller.Department.Department;
import Controller.Enterprise.Enterprise;
import Controller.HealthNGO;
import Controller.Users.Users;
import gui.AdministrationAssistance.AdministrationAssistanceWorkerjPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class AdministrationAssistanceRole extends Role{
//
    public AdministrationAssistanceRole(){
        this.type = Role.RoleType.AdministrationAssistance;
    }
    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, Users account, Department department, Enterprise enterprise, HealthNGO system) {
        return new AdministrationAssistanceWorkerjPanel(userLoginContainer,container,enterprise,account, system);
    }
}