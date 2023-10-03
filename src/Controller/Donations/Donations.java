/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Donations;

import Controller.Users.Users;
import java.util.Date;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class Donations {
    
    private String name,notes,status;
    private int id;
    private static int count = 1;
    private double amount;
    private Users donar;
    private Date donationDate;

    public Donations(){
        donationDate=new Date();
        id = count;
        count++;
    }
    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Users getDonar() {
        return donar;
    }

    public void setDonar(Users donar) {
        this.donar = donar;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        return name;
    }
}