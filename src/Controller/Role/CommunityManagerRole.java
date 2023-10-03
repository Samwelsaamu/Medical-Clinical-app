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
import gui.CommunityManagerRole.CommunityManagerWorkerjPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class CommunityManagerRole extends Role{
//
    public CommunityManagerRole(){
        this.type = Role.RoleType.CommunityManager;
    }
    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, Users account, Department department, Enterprise enterprise, HealthNGO system) {
        return new CommunityManagerWorkerjPanel(userLoginContainer,container,enterprise,department,account, system);
    }
}