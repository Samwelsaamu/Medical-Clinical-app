/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Department.Department;
import Controller.Network.Network;
import Controller.Role.Role;
import Controller.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class HealthNGO extends Department{
    
    private static HealthNGO business;
    private ArrayList<Network> networkList;
    public static HealthNGO getInstance(){
        if(business==null){
            business=new HealthNGO();
        }
        return business;
    }
    
    public Network createNewNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfNetworkIsUnique(String username){
        for (Network network : networkList){
            if (network.getName().equals(username)){
                return false;
            }
        }
        return true;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private HealthNGO(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUsersDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}