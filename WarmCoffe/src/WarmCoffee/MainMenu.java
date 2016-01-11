package WarmCoffee;

import GUI.CreateEventView;
import GUI.LoginView;
import GUI.MainMenuView;

public class MainMenu extends MainMenuView {
    String username;
    public MainMenu(String username) {
        super();
        this.username=username;
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    protected void showEvents() {
        
        EventsList s = new EventsList(username);
        s.setVisible(true);
    }

    @Override
    protected void showSectors() {
        SectorsList s = new SectorsList();
        s.setVisible(true);
    }

    @Override
    protected void exit() {
        
        Users n = new Users();
        Login s = new Login(n);
        s.setVisible(true);
        this.setVisible(false);
    }

    @Override
    protected void showMyEvents() {
        EventUserList s = new EventUserList();
        s.setVisible(true);
    
    }

    @Override
    protected void showMyReservations() {
    
        ReservationUserList s = new ReservationUserList();
        s.setVisible(true);
        
    }

    @Override
    protected void createEvent() {
    
        CreateEvent s = new CreateEvent();
        s.setVisible(true);
    
    }

    @Override
    protected void modifyProfile() {
     
        ModifyProfile s = new ModifyProfile();
        s.setVisible(true);
        
    }

}
