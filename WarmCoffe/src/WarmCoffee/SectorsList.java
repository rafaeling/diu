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
    Sectors sectors;
    
    public SectorsList(String username,Sectors sectors)
    {
        super();
        this.username = username;
        this.sectors=sectors;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
