/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.Role;
import Controller.Role.SupplyChainManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class PharmaceuticalsSupplyChainDepartment extends Department{

    public PharmaceuticalsSupplyChainDepartment() {
        super(Department.Type.PharmaceuticalsSupplyChainDepart.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplyChainManagerRole());
        return roles;
    } 
}