package WarmCoffee;

import GUI.MainMenuView;

public class MainMenu extends MainMenuView {
    String username;
    public MainMenu(String username) {
        super();
        this.username=username;
    }

    @Override
    protected void showEvents() {
        
        EventsList s = new EventsList();
        s.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }

    @Override
    protected void showSectors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
