package WarmCoffee;

import GUI.LoginView;
import GUI.MainMenuView;

public class MainMenu extends MainMenuView {
    String username;
    public MainMenu(String username) {
        super();
        this.username=username;
    }

    @Override
    protected void showEvents() {
        
        EventsList s = new EventsList(username);
        s.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }

    @Override
    protected void showSectors() {
        SectorsList s = new SectorsList();
        s.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }

    @Override
    protected void exit() {
        
        Users n = new Users();
        Login s = new Login(n);
        s.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }

}
