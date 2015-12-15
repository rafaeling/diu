package WarmCoffee;

import GUI.LoginView;

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
            System.out.println("Hello");
            MainMenu menuWindow=new MainMenu(username);
            menuWindow.setVisible(true);
            this.setVisible(false);
            this.dispose();
            return true;
        }
        else return false;
    }

    @Override
    protected void showHelpGUI() {
        // TODO Auto-generated method stub
    }

}
