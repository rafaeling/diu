/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.CreateAccountView;
import GUI.ErrorLogin;

/**
 *
 * @author rafae
 */
public class CreateAccount extends CreateAccountView {

    Users users;

    public CreateAccount(Users users) {
        super();
        this.users = users;
    }

    @Override
    protected void cancel() {
        this.setVisible(false);
    }

    @Override
    protected void next(String name, String mail, String pass1, String pass2) {
        if (!pass1.equals(pass2) || mail.isEmpty() || name.isEmpty() || pass1.isEmpty()) {
            ErrorLogin menuWindow = new ErrorLogin();
            menuWindow.setVisible(true);
        } else if (users.addUser(name, pass1,mail) == false) {
            ErrorLogin menuWindow = new ErrorLogin();
            menuWindow.setVisible(true);

        } else {
            this.setVisible(false);
        }

    }
}
