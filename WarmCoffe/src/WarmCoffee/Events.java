package WarmCoffee;

//Store events

import java.util.HashMap;

public class Events {
        HashMap<Integer,Event> eventList;
        int currentId;
	public Events() {
        this.eventList = new HashMap<>();
        currentId=0;
	}
        public int addEvent(Event event){
            currentId++;
            eventList.put(currentId, event);
            return currentId;
        }
        public Event getEvent(int id){
            return eventList.get(id);
        }

}
