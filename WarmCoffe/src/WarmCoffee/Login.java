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
    public Login(Users users) {
        super();
        this.users=users;
    }

    @Override
    protected boolean login(String username,String password) {
        System.out.println(username);
        if(users.checkUser(username,password)) {
            MainMenu menuWindow = new MainMenu(username,this.users);
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
