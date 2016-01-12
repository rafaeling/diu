/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import java.util.ArrayList;

/**
 *
 * @author andres Ortiz
 */
public class User {
    public String pass;
    public String email;
    public ArrayList<Integer> events=new ArrayList<>();
    public User(String pass,String email){
        this.pass=pass;
        this.email=email;
    }
    public void assistEvent(int eventId){
       if(events.contains(eventId)==false) events.add(eventId);
    }
    
}
