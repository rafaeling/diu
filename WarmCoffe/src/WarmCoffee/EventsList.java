/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.EventsListView;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author rafaeling
 */
public class EventsList extends EventsListView{
    
    String username;
    Events events;
    
    public EventsList(String name,Events events) {
        super();
        this.username = name;
        this.events=events;
        setEvents();
    }
    
    @Override
    protected void back() {
        
        this.setVisible(false);
        
    }

    @Override
    protected void asistire() {
      
    }
    
    private void setEvents(){
       Collection<Event> eventList= events.eventList.values();
        for(Event ev:eventList){
            this.addEvent(ev);
        }
        this.refreshEvents();
        
    }
    
}
