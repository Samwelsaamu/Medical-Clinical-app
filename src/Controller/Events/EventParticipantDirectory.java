/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Events;

import Controller.Users.Users;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class EventParticipantDirectory {
    
    private ArrayList<EventsParticipant> eventsPartcipantsList;

    public EventParticipantDirectory() {
        eventsPartcipantsList = new ArrayList<>();
    }

    public ArrayList<EventsParticipant> getEventsParticipantList() {
        return eventsPartcipantsList;
    }
    
    public EventsParticipant createEventsParticipant(Events thisevent,Users participant,String status){
        EventsParticipant event = new EventsParticipant();
        event.setEvent(thisevent);
        event.setParticipant(participant);
        event.setStatus(status);
        eventsPartcipantsList.add(event);
        return event;
    }
    
    public boolean checkIfEventIsUnique(Events eventname,Users participant){
        for (EventsParticipant event : eventsPartcipantsList){
            if (event.getEvent().equals(eventname) && event.getParticipant().equals(participant))
                return false;
        }
        return true;
    }
}
