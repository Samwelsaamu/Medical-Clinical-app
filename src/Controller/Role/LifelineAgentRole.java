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
import gui.LifelineAgent.LifelineWorkerjPanel;
import gui.MentalHealthWorkerRole.MentalHealthWorkerjPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class LifelineAgentRole extends Role{
//
    public LifelineAgentRole(){
        this.type = Role.RoleType.LifelineAgent;
    }
    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, Users account, Department department, Enterprise enterprise, HealthNGO system) {
        return new LifelineWorkerjPanel(userLoginContainer,container,enterprise,account, system);
    }
}