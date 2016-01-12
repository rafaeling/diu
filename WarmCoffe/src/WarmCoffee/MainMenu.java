package WarmCoffee;

import GUI.CreateEventView;
import GUI.LoginView;
import GUI.MainMenuView;
import java.util.ArrayList;

public class MainMenu extends MainMenuView {
    String username;
    User user;
    Users users;
    Events events;
    Login login;
    Sectors sectors;
    public MainMenu(String username,Users users,Login l,Events events,Sectors sectors) {
        super();
        this.username=username;
        this.users=users;
        this.user=users.getUser(username);
        this.login=l;
        this.events=events;
        this.sectors=sectors;
        refreshUser(username,user.email);
        
        refreshEvents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       
    }

    @Override
    protected void showEvents() {
        
        EventsList s = new EventsList(username,events);
        s.setVisible(true);
    }

    @Override
    protected void showSectors() {
        SectorsList s = new SectorsList(this.username,this.sectors);
        s.setVisible(true);
    }

    @Override
    protected void exit() {
        
        Users n = new Users();
       // Login s = new Login(n);
       // s.setVisible(true);
        login.setVisible(true);
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
    
        CreateEvent s = new CreateEvent(events,user,this);
        s.setVisible(true);
    
    }

    @Override
    protected void modifyProfile() {
     
        ModifyProfile s = new ModifyProfile(users,username,this);
        s.setVisible(true);
        
    }
    public void refreshUser(String username,String mail){
         changeUsername(username,mail);
        
    }
    public void refreshEvents(){
        ArrayList<Integer> userEvents=user.events;
        int count=0;
        for(int i:userEvents){
            Event ev=events.getEvent(i);
            this.addEvent(count,ev.name,ev.sector,"12/01/2016");
            count++;
        }
    }

}
