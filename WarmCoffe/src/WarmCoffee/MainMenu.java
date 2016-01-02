package WarmCoffee;

import GUI.CreateEvent;
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

    @Override
    protected void showMyEvents() {
        EventUserList s = new EventUserList();
        s.setVisible(true);
        this.setVisible(false);
        this.dispose();
    
    }

    @Override
    protected void showMySectors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void createEvent() {
    
        CreateEvent s = new CreateEvent();
        s.setVisible(true);
        this.setVisible(false);
        this.dispose();
    
    }

}
