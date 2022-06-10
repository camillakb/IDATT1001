package EventRegisters;

/**
 * Clas to initialize Event objects with relevant methods.
 */

public class Event {
    private int number;
    private String name;
    private String location;
    private String organizer;
    private String type;
    private long time;

    /**
     * Simple constructor that initializes an event.
     * @param number the event's number.
     * @param name the event's name.
     * @param location the location of the event.
     * @param organizer the organizer of the event.
     * @param type the type of event (for example concert, party, etc.).
     * @param time the time of the event.
     */
    public Event(int number, String name, String location, String organizer, String type, long time) { 
        this.number = number;
        this.name = name;
        this.location = location;
        this.organizer = organizer;
        this.type = type;
        this.time = time;
    }

    /**
     * Get-method for the event's number.
     * @return the event's number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Get-method for the event's name.
     * @return the name of the event.
     */
    public String getName() {
        return name;
    }

    /**
     * Get-method for the event's location.
     * @return the event's location.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Get-method for the event's organizer.
     * @return the event's organizer.
     */
    public String getOrganizer() {
        return organizer;
    }

    /**
     * Get-method for the event's type.
     * @return the type of event.
     */
    public String getType() {
        return type;
    }

    /**
     * Get-method for the event's time.
     * @return the time of the event.
     */
    public long getTime() {
        return time;
    }

    /**
     * ToString method for the Event object.
     */
    public String toString() {
        String eventToString = "";
        eventToString = eventToString.concat("#" + getNumber() + ". ");
        eventToString = eventToString.concat("Event name: " + getName() + "\n");
        eventToString = eventToString.concat("Location of the event: " + getLocation() + "\n");
        eventToString = eventToString.concat("Organizer of the event: " + getOrganizer() + "\n");
        eventToString = eventToString.concat("Type of event: " + getType() + "\n");
        eventToString = eventToString.concat("Time of the event: " + getTime() + "\n");

        return eventToString;
    }
}
