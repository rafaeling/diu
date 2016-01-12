/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

/**
 *
 * @author rafaeling,andrés ortiz
 */
public class WarmCoffee {
    public static void main(String[] args) {
        Users users=new Users();
        Events events=new Events();
        int evId=events.addEvent(new Event("Evento de prueba","un evento muy bonito",18,3));
        users.addUser("arthur","dontpanic","mymail"); //usuario de prueba
        users.getUser("arthur").assistEvent(evId);
        
        Login loginWindow=new Login(users,events);
        loginWindow.setVisible(true);
    }

}
