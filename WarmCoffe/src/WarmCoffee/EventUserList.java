/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.EventsUserListView;

/**
 *
 * @author rafae
 */
public class EventUserList extends EventsUserListView{
    
    public EventUserList()
    {
        super();
    }

    @Override
    protected void back() {
        this.setVisible(false);
    }

    @Override
    protected void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
