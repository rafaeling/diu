package WarmCoffee;

import java.util.ArrayList;


//Stores sectors
public class Sectors {
    public ArrayList<Sector> sectorList=new ArrayList<>();
	public Sectors(){
            
        }
        public void addSector(Sector sector){
            sectorList.add(sector);
        }

}
