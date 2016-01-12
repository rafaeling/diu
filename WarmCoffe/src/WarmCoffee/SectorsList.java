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
    
    User user;
    MainMenu menu;
    
    public SectorsList(User user,MainMenu menu)
    {
        super();
        this.user = user;
        this.menu=menu;
    }

    @Override
    protected void back() {
        
        this.setVisible(false);
    }



    @Override
    protected void buscar() {
    
    }

    @Override
    protected void reservar(String from, String to, String day, String month) {
        user.reserveSector(new Sector(from,to,day,month));
        menu.refreshSectors();
        this.setVisible(false);
    }
    
}
