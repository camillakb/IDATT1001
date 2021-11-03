package Classes;

import java.util.ArrayList;
import java.util.Collections;

public class EventRegister {

    private ArrayList<Event> events;
    
    public EventRegister() { //Constructor
        this.events = new ArrayList<Event>();
    }
    
    public void addEvent(Event newEvent) { //Add a new event.
        this.events.add(newEvent);
    }

    public ArrayList<Event> getEventsAtLocation(String location) { //Get events at a specific location.
        ArrayList<Event> resultList = new ArrayList<Event>();

        for(Event event : this.events) {
            if(event.getLocation().equals(location)) {
                resultList.add(event);
            }
        }
        return resultList;
    }

    public ArrayList<Event> getEventsAtDate(long date) { //Get events at a specific date.
        ArrayList<Event> resultList = new ArrayList<Event>();

        for(Event event : this.events) {
            if(date == event.getTime()/10000) {
                resultList.add(event);
            }
        }
        return resultList;
    }

    public ArrayList<Event> getEventsBetweenDates(long startDate, long lastDate) { //Get events between two set dates.
        ArrayList<Event> resultList = new ArrayList<Event>();

        for(Event event : this.events) {
            if(startDate <= event.getTime()/10000 && event.getTime()/10000 <= lastDate) {
                resultList.add(event);
            }
        }
        return resultList;
    }

    public ArrayList<Event> getEventsOfType(String types) { //Get events based on type of event (not used in client).
        ArrayList<Event> resultList = new ArrayList<Event>();

        for(Event event : this.events) {
            if(event.getType().equals(types)) {
                resultList.add(event);
            }
        }
        return resultList;
    }

    public ArrayList<Event> sortEventsByLocation() { //Sorts list of events based on location.
        ArrayList<Event> resultList = new ArrayList<Event>();
        ArrayList<String> locations = new ArrayList<String>();

        for (Event event : this.events) {
            if (!locations.contains(event.getLocation())) {
                locations.add(event.getLocation());
            }
        }

        Collections.sort(locations);

        for (String location : locations) {
            resultList.addAll(this.getEventsAtLocation(location));
        }

        return resultList;
    }
    
    public ArrayList<Event> sortEventsByType() { //Sorts list of events based on type.
        ArrayList<Event> resultList = new ArrayList<Event>();
        ArrayList<String> types = new ArrayList<String>();

        for(Event event : this.events) {
            if(!types.contains(event.getType())) {
                types.add(event.getType());
            }
        }

        Collections.sort(types);

        for(String type :types) {
            resultList.addAll(this.getEventsOfType(type));
        }

        return resultList;
    }

    public ArrayList<Event> sortEventsByTime() { //Sorts list of events based on time of the event.
        ArrayList<Event> resultList = new ArrayList<Event>();
        ArrayList<Long> timeOfEvent = new ArrayList<Long>();

        for(Event event : this.events) {
            if(!timeOfEvent.contains(event.getTime())) {
                timeOfEvent.add(event.getTime());
            }
        }

        Collections.sort(timeOfEvent);

        for(long time : timeOfEvent) {
            resultList.addAll(this.getEventsAtDate(time/10000)); 
        }

        return resultList;
    }

    public String toString() {
        String eventList = "";
        for(Event event : this.events) {
            eventList = eventList.concat(event.toString());
            eventList = eventList.concat("\n");
        }

        return eventList;
    }

}
