/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Donations;

import Controller.Users.Users;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class DonationDirectory {
    
    private ArrayList<Donations> donationList;

    public DonationDirectory() {
        donationList = new ArrayList<>();
    }

    public ArrayList<Donations> getDonationsList() {
        return donationList;
    }
    
    public Donations createDonations(String name,String notes,double amount,Users donar){
        Donations donation = new Donations();
        donation.setName(name);
        donation.setAmount(amount);
        donation.setDonar(donar);
        donation.setNotes(notes);
        donation.setStatus("Sent");
        donationList.add(donation);
        return donation;
    }
    
    public boolean checkIfDonationsIsUnique(String donationname){
        for (Donations donation : donationList){
            if (donation.getName().equals(donationname))
                return false;
        }
        return true;
    }
}
