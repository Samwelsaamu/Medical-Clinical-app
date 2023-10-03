/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Enterprise;

import Controller.Department.Department;
import Controller.Role.DrugDeliveryAgentRole;
import Controller.Role.PharmacistRole;
import Controller.Role.PharmacyBillingAgentRole;
import Controller.Role.Role;
import Controller.Role.SupplyChainManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class PharmacyEnterprise extends Enterprise {
    
    public PharmacyEnterprise(String name){
        super(name,EnterpriseType.Pharmcy);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmacistRole());
        roles.add(new DrugDeliveryAgentRole());
        roles.add(new PharmacyBillingAgentRole());
        roles.add(new SupplyChainManagerRole());
        return roles;
    }
    
    @Override
    public ArrayList<Department.Type> getSupportedDepartment() {
        ArrayList<Department.Type> organizations = new ArrayList<>();
        organizations.add(Type.PharmacyDepartment);
        organizations.add(Type.PharmacyBillingDepartment);
        organizations.add(Type.PharmaceuticalsSupplyChainDepart);
        return organizations;
    }
}