/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.ModifyEventView;

/**
 *
 * @author rafae
 */
public class ModifyEvent extends ModifyEventView{

    @Override
    protected void back() {
    
        this.setVisible(false);
    }

    @Override
    protected void SaveChanges() {
        this.setVisible(false);
    }
    
}
