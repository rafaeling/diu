/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

/**
 *
 * @author andrew
 */
public class Sector {
    public String from;
    public String to;
    public String day;
    public String month;
    public int id;
    public Sector(int id,String from,String to,String day,String month){
        this.id=id;
        this.from=from;
        this.to=to;
        this.day=day;
        this.month=month;    
    }
}
