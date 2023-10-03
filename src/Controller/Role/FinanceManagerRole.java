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
import gui.FinanceManagerRole.FinanceManagerWorkerjPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class FinanceManagerRole extends Role{
//
    public FinanceManagerRole(){
        this.type = Role.RoleType.FinanceManager;
    }
    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, Users account, Department department, Enterprise enterprise, HealthNGO system) {
        return new FinanceManagerWorkerjPanel(userLoginContainer,container,enterprise,department,account, system);
    }
}