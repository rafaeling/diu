package WarmCoffee;

import GUI.CreateAccountView;
import GUI.ErrorLogin;
import GUI.LoginView;
import java.awt.event.MouseAdapter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends LoginView {
    Users users;
    Events events;
    public Login(Users users,Events events) {
        super();
        this.users=users;
        this.events=events;
    }

    @Override
    protected boolean login(String username,String password) {
        System.out.println(username);
        if(users.checkUser(username,password)) {
            MainMenu menuWindow = new MainMenu(username,this.users,this,events);
            menuWindow.setVisible(true);
            this.setVisible(false);
            return true;
        }
        else{ 
            
            ErrorLogin menuWindow = new ErrorLogin();
            menuWindow.setVisible(true);
            
            
            
            
            return false;
        }
    }
    
    @Override
    protected void createAccount() {
        CreateAccount acc = new CreateAccount(users);
        acc.setVisible(true);
    }
 

}
