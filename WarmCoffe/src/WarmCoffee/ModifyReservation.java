/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.ModifyReservationView;

/**
 *
 * @author rafae
 */
public class ModifyReservation extends ModifyReservationView{

    public ModifyReservation()
    {
        super();
    }
    
    @Override
    protected void back() {
        this.setVisible(false);
    }

    @Override
    protected void saveChanges() {
    
        this.setVisible(false);
    }
    
}
