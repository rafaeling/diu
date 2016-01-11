/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.EventsListView;

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
    }
    
    @Override
    protected void back() {
        
        this.setVisible(false);
        
    }

    @Override
    protected void asistire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
