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
class Event {
    public String name;
    public String description;
    public int plazas;
    public int available;
    public int sector;
    public String owner;
    public Event(String name,String description,int plazas,int sector,String owner){
        this.name=name;
        this.description=description;
        this.plazas=plazas;
        this.sector=sector;
        this.available=plazas;
        this.owner=owner;
    }
    
}
