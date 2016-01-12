/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.CreateEventView;

/**
 *
 * @author rafae
 */
public class CreateEvent extends CreateEventView{

    Events events;
    User user;
    MainMenu menu;
    CreateEvent(Events events,User user,MainMenu menu)
    {
        super();
        this.events=events;
        this.user=user;
        this.menu=menu;
    }


    @Override
    protected void back() {
    
        this.setVisible(false);
        
    }

    @Override
    protected void createEvent(String name, String description, int participants, int sector) {
       Event ev=new Event(name,description,participants,sector);
       user.assistEvent(events.addEvent(ev));
       menu.refreshEvents();
       this.setVisible(false);
    }
    
}
