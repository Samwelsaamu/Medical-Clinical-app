/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Events;

import Controller.Users.Users;
import java.util.Date;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class EventsParticipant {
    private String status;
    private Events event;
    private Users participant;
    private Date registeredOn;
    private int id;
    private static int count = 1;
   
    public EventsParticipant() {
        id = count;
        count++;
        registeredOn=new Date();
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Events getEvent() {
        return event;
    }

    public void setEvent(Events event) {
        this.event = event;
    }

    public Users getParticipant() {
        return participant;
    }

    public void setParticipant(Users participant) {
        this.participant = participant;
    }

    public Date getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(Date registeredOn) {
        this.registeredOn = registeredOn;
    }

    @Override
    public String toString() {
        return event.getName();
    }
}