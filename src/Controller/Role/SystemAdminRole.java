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
import gui.stardardLogin.AuthorizedWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class SystemAdminRole extends Role{
//Authorizes the System and adds enterprises, admins and networks and departments
    public SystemAdminRole(){
        this.type = RoleType.SysAdmin;
    }
    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, Users account, Department department, Enterprise enterprise, HealthNGO system) {
        return new AuthorizedWorkArea(userLoginContainer,container,account, system);
    }
}