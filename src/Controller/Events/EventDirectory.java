/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Events;

import java.util.ArrayList;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class EventDirectory {
    
    private ArrayList<Events> eventsList;

    public EventDirectory() {
        eventsList = new ArrayList<>();
    }

    public ArrayList<Events> getEventsList() {
        return eventsList;
    }
    
    public Events createEvent(String name,String Description,String Venue, String date,String time,String status){
        Events event = new Events();
        event.setName(name);
        event.setDescription(Description);
        event.setVenue(Venue);
        event.setDate(date);
        event.setTime(time);
        event.setStatus(status);
        eventsList.add(event);
        return event;
    }
    
    public boolean checkIfEventIsUnique(String eventname){
        for (Events event : eventsList){
            if (event.getName().equals(eventname))
                return false;
        }
        return true;
    }
}
