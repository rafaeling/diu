/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.SectorsListView;

/**
 *
 * @author rafae
 */
public class SectorsList extends SectorsListView{
    
    String username;
    
    public SectorsList()
    {
        super();
        this.username = "";
    }

    @Override
    protected void back() {
        
        this.setVisible(false);
    }
    
}
