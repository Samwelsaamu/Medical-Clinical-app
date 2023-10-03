/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Employee.Employee;
import Controller.Role.SystemAdminRole;
import Controller.Users.Users;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class Configure {
    
    public static HealthNGO configure(){
        
        HealthNGO system = HealthNGO.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        Users ua = system.getUsersDirectory().createUser("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}