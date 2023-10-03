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
import gui.DrugDeliveyAgentRole.DrugDeliveryWorkerjPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class DrugDeliveryAgentRole extends Role{
//
    public DrugDeliveryAgentRole(){
        this.type = Role.RoleType.DrugDeliveryAgent;
    }
    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, Users account, Department department, Enterprise enterprise, HealthNGO system) {
        return new DrugDeliveryWorkerjPanel(userLoginContainer,container,enterprise,department,account, system);
    }
}