package Classes;

public class Event {
    private int number;
    private String name;
    private String location;
    private String organizer;
    private String type;
    private long time;

    public Event(int number, String name, String location, String organizer, String type, long time) { 
        this.number = number;
        this.name = name;
        this.location = location;
        this.organizer = organizer;
        this.type = type;
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOrganizer() {
        return organizer;
    }

    public String getType() {
        return type;
    }

    public long getTime() {
        return time;
    }

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
