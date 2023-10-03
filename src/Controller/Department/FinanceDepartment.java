/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.DonationsManagerRole;
import Controller.Role.FinanceManagerRole;
import Controller.Role.Role;
import Controller.Role.TreasurerRole;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class FinanceDepartment extends Department{

    public FinanceDepartment() {
        super(Department.Type.FinanceDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonationsManagerRole());
        roles.add(new TreasurerRole());
        roles.add(new FinanceManagerRole());
        return roles;
    } 
}