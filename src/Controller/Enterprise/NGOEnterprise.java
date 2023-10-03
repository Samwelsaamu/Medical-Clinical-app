/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Enterprise;

import Controller.Department.Department;
import Controller.Role.CommunityManagerRole;
import Controller.Role.DonationsManagerRole;
import Controller.Role.FinanceManagerRole;
import Controller.Role.HelpDeskAgentRole;
import Controller.Role.ITAdminRole;
import Controller.Role.ProcessManagerRole;
import Controller.Role.Role;
import Controller.Role.TreasurerRole;
import Controller.Role.WebsiteManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class NGOEnterprise extends Enterprise {
    
    public NGOEnterprise(String name){
        super(name,EnterpriseType.NGOEnterprise);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HelpDeskAgentRole());
        roles.add(new CommunityManagerRole());
        roles.add(new ProcessManagerRole());
        roles.add(new WebsiteManagerRole());
        roles.add(new ITAdminRole());
        roles.add(new DonationsManagerRole());
        roles.add(new TreasurerRole());
        roles.add(new FinanceManagerRole());
        return roles;
    }
    
    @Override
    public ArrayList<Department.Type> getSupportedDepartment() {
        ArrayList<Department.Type> organizations = new ArrayList<>();
        organizations.add(Type.SupportDepartment);
        organizations.add(Type.CommunityManagement);
        organizations.add(Type.OperationsDepartment);
        organizations.add(Type.ITDepartment);
        organizations.add(Type.FinanceDepartment);
        return organizations;
    }
}