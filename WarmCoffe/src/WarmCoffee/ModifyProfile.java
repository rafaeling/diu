/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.ErrorLogin;
import GUI.ModifyProfileView;

/**
 *
 * @author rafae
 */
public class ModifyProfile extends ModifyProfileView {

    Users users;
    String username;
    MainMenu menu;

    public ModifyProfile(Users users, String username,MainMenu menu) {
        super();
        this.users = users;
        this.username = username;
        this.menu=menu;
    }

    @Override
    protected void back() {
        this.setVisible(false);
    }

    @Override
    protected void modify(String username, String mail, String pass1, String pass2) {
        if (!pass1.equals(pass2) || mail.isEmpty() || username.isEmpty() || pass1.isEmpty()) {
            ErrorLogin menuWindow = new ErrorLogin();
            menuWindow.setVisible(true);
        } else if (users.modifyUser(this.username, username, new User(pass1, mail)) == false) {
            ErrorLogin menuWindow = new ErrorLogin();
            menuWindow.setVisible(true);

        } else {
            menu.refreshUser(username, mail);
            this.setVisible(false);
        }

    }
}
