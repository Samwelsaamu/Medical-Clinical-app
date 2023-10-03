/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Department;

import Controller.Department.Department.Type;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class DepartmentDirectory {
    
    private ArrayList<Department> departmentList;

    public DepartmentDirectory() {
        departmentList = new ArrayList<Department>();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }
    
    public Department createDepartment(Type type){
        Department department = null;
        if (type.getValue().equals(Type.Administration.getValue())){
            department = new AdministrationDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.CommunityManagement.getValue())){
            department = new CommunityManagementDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.CriticalCareDepartment.getValue())){
            department = new CriticalCareDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.CriticalResponseDepartment.getValue())){
            department = new CriticalResponseDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.EmergencyDepartment.getValue())){
            department = new EmergencyDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.FinanceDepartment.getValue())){
            department = new FinanceDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.HospitalManagementDepartment.getValue())){
            department = new HospitalManagementDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.ITDepartment.getValue())){
            department = new ITDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.OperationsDepartment.getValue())){
            department = new OperationsDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.PatientCareDepartment.getValue())){
            department = new PatientCareDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.PharmaceuticalsSupplyChainDepart.getValue())){
            department = new PharmaceuticalsSupplyChainDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.PharmacyBillingDepartment.getValue())){
            department = new PharmacyBillingDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.SupportDepartment.getValue())){
            department = new SupportDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.PharmacyDepartment.getValue())){
            department = new PharmacyDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(Type.RehabCenterDepartment.getValue())){
            department = new RehabCenterDepartment();
            departmentList.add(department);
        }
        return department;
    }
    
    public boolean checkIfDepartmentIsUnique(String username){
        for (Department department : departmentList){
            if (department.getName().equals(username))
                return false;
        }
        return true;
    }
}