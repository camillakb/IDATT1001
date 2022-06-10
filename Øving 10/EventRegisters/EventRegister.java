package EventRegisters;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class to initialize an EventRegister object with relevant methods.
 */

public class EventRegister {

    private ArrayList<Event> events;
    
    /**
     * Simple constructor to initialize an EventRegister object.
     */
    public EventRegister() {
        this.events = new ArrayList<Event>();
    }
    
    /**
     * Method to add a new event to the list of events.
     * @param newEvent the event that will be added to the list of events.
     */
    public void addEvent(Event newEvent) { 
        this.events.add(newEvent);
    }

    /**
     * Method to get all events at a specific location.
     * @param location the location to view events for.
     * @return a list of events at the desired location.
     */
    public ArrayList<Event> getEventsAtLocation(String location) {
        ArrayList<Event> resultList = new ArrayList<Event>();

        for (Event event : this.events) {
            if (event.getLocation().equals(location)) {
                resultList.add(event);
            }
        }
        return resultList;
    }

    /**
     * Method to get events at a specific date.
     * @param date the date to view events for.
     * @return a list of events at the desired date.
     */
    public ArrayList<Event> getEventsAtDate(long date) { 
        ArrayList<Event> resultList = new ArrayList<Event>();

        for (Event event : this.events) {
            if (date == event.getTime()/10000) {
                resultList.add(event);
            }
        }
        return resultList;
    }

    /**
     * Method to  get all events between two dates.
     * @param startDate the first date to view events for.
     * @param lastDate the last date to view events for.
     * @return a list of events in the given interval of dates.
     */
    public ArrayList<Event> getEventsBetweenDates(long startDate, long lastDate) { 
        ArrayList<Event> resultList = new ArrayList<Event>();

        for (Event event : this.events) {
            if (startDate <= event.getTime()/10000 && event.getTime()/10000 <= lastDate) {
                resultList.add(event);
            }
        }
        return resultList;
    }

    /**
     * Method to get events of a specific type.
     * @param types the type of event to view.
     * @return a list of events of the desired type.
     */
    public ArrayList<Event> getEventsOfType(String types) { 
        ArrayList<Event> resultList = new ArrayList<Event>();

        for (Event event : this.events) {
            if (event.getType().equals(types)) {
                resultList.add(event);
            }
        }
        return resultList;
    }

    /**
    * Method to sort  events by their  location.
    * @return a list of all the events sorted by their location.
    */ 
    public ArrayList<Event> sortEventsByLocation() { 
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
    
    /**
     * Method to get all events sorted by the event type.
     * @return a list of all events sorted by the type of event.
     */
    public ArrayList<Event> sortEventsByType() { 
        ArrayList<Event> resultList = new ArrayList<Event>();
        ArrayList<String> types = new ArrayList<String>();

        for (Event event : this.events) {
            if (!types.contains(event.getType())) {
                types.add(event.getType());
            }
        }

        Collections.sort(types);

        for (String type :types) {
            resultList.addAll(this.getEventsOfType(type));
        }

        return resultList;
    }

    /**
     * Method to sort all the events by the time of the event.
     * @return a list of event sorted by the event time.
     */
    public ArrayList<Event> sortEventsByTime() { 
        ArrayList<Event> resultList = new ArrayList<Event>();
        ArrayList<Long> timeOfEvent = new ArrayList<Long>();

        for (Event event : this.events) {
            if (!timeOfEvent.contains(event.getTime())) {
                timeOfEvent.add(event.getTime());
            }
        }

        Collections.sort(timeOfEvent);

        for (long time : timeOfEvent) {
            resultList.addAll(this.getEventsAtDate(time/10000)); 
        }

        return resultList;
    }

    /**
     * ToString method for the EventRegister object.
     */
    public String toString() {
        String eventList = "";
        for(Event event : this.events) {
            eventList = eventList.concat(event.toString());
            eventList = eventList.concat("\n");
        }

        return eventList;
    }
}
