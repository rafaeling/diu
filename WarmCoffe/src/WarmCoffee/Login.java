package WarmCoffee;

import GUI.CreateAccountView;
import GUI.ErrorLogin;
import GUI.LoginView;
import java.awt.event.MouseAdapter;

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
            MainMenu menuWindow = new MainMenu(username);
            menuWindow.setVisible(true);
            this.setVisible(false);
            this.dispose();
            return true;
        }
        else{ 
            
            ErrorLogin menuWindow = new ErrorLogin();
            menuWindow.setVisible(true);
            
            
            
            this.setVisible(true);
            
            return false;
        }
    }
    
    @Override
    protected void createAccount() {
        CreateAccount acc = new CreateAccount();
        acc.setVisible(true);
    }
 

}
