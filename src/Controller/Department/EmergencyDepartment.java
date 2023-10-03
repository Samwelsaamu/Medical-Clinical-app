/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Role.EmergencyMedicineDoctorRole;
import Controller.Role.EmergencyVehicleDriverRole;
import Controller.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class EmergencyDepartment extends Department{

    public EmergencyDepartment() {
        super(Department.Type.EmergencyDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EmergencyVehicleDriverRole());
        roles.add(new EmergencyMedicineDoctorRole());
        return roles;
    } 
}