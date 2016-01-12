/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

/**
 *
 * @author andres Ortiz
 */
public class Event {
    public String name;
    public String description;
    public int plazas;
    public int available;
    public int sector;
    public Event(String name,String description,int plazas,int sector){
        this.name=name;
        this.description=description;
        this.plazas=plazas;
        this.sector=sector;
        this.available=plazas;
    }
    
}
