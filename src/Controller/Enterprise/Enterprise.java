/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Enterprise;

import Controller.Department.Department;
import Controller.Department.DepartmentDirectory;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public abstract class Enterprise extends Department{
    
    private EnterpriseType enterpriseType;
    private DepartmentDirectory organizationDirectory;

    public DepartmentDirectory getDepartmentDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        NGOEnterprise("NGO"),
        Pharmcy("Pharmacy"),
        Medical("Medical"),
        RehabCenter("RehabCenter"),
        SuicidePrevention("SuicidePrevention");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new DepartmentDirectory();
    }
    public abstract ArrayList<Department.Type> getSupportedDepartment();
}