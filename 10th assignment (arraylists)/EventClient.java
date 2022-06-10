import EventRegisters.Event;
import EventRegisters.EventRegister;

import java.util.Scanner;

/**
 * Client for the EventRegister class.
 */

public class EventClient {
    public static void main(String[] args) {

        //Registering some example events.
        EventRegister listOfEvents = new EventRegister(); 
        listOfEvents.addEvent(new Event(1, "Taconight", "Restaurant", "FirstName LastName", "Dinner", 202112101800L));
        listOfEvents.addEvent(new Event(2, "Christmas concert", "School", "Choir", "Concert", 202112201600L));
        listOfEvents.addEvent(new Event(3, "Karaoke", "Night club", "Night club owner", "Party", 202111302000L));
        listOfEvents.addEvent(new Event(4, "Bowling", "Bowling 1", "Class coordinator", "Sport", 202111251700L));

        int newEventNumber, userInputNumber;
        String newEventName, newEventLocation, newEventOrganizer, newEventType;
        long newStartDate , newLastDate, newEventTime;
        Scanner input = new Scanner(System.in);

        //Do-while loop to allow the user to make multiple choices when running the client.
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Show all events. \n2. Register a new event. \n3. Find all events at a specific location.");
            System.out.println("4. View all events on a specific date. \n5. View all events at a given time interval.");
            System.out.println("6. View events sorted by the time of the event. \n7. View events sorted by the location of the events.");
            System.out.println("8. View events sorted by the type of event. \n9. Quit.");

            userInputNumber = input.nextInt();
            System.out.println();

            switch(userInputNumber) {

                case 1: //Prints all events.
                    System.out.println(listOfEvents);
                    break;

                case 2: //Registers new event. The instances of 'input.nextLine()' is to  consume the \n character.
                    System.out.println("What eventnumber is this?"); 
                    input.nextLine();
                    newEventNumber = input.nextInt();

                    System.out.println("What is the name of the event?");
                    input.nextLine();
                    newEventName = input.nextLine();

                    System.out.println("What is the location of the event?");
                    newEventLocation = input.nextLine();

                    System.out.println("Who will be organizing the event?");
                    newEventOrganizer = input.nextLine();

                    System.out.println("What type of event is this?");
                    newEventType = input.nextLine();

                    System.out.println("At what time will the event take place? Please answer with year, month, date and time like this: 202001011800");
                    newEventTime = input.nextLong();

                    listOfEvents.addEvent(new Event(newEventNumber, newEventName, newEventLocation, newEventOrganizer, newEventType, newEventTime));
                    break;

                case 3: //Shows all events for a specific location.
                    System.out.println("What location would you like to see the events for?"); 
                    input.nextLine();
                    newEventLocation = input.nextLine();
                    System.out.println(listOfEvents.getEventsAtLocation(newEventLocation));
                    break;

                case 4: //Shows all events for a specific date.
                    System.out.println("What date would you like to see events for? Please use the format year,month,date like this: 20210101"); 
                    newEventTime = input.nextLong();
                    System.out.println(listOfEvents.getEventsAtDate(newEventTime));
                    break;

                case 5: //Show all events between two dates.
                    System.out.println("Insert the earliest date you would like to see events for by year, month and date like this: 20210101."); 
                    newStartDate = input.nextLong();
                    System.out.println("Insert the last date you would like to see events for.");
                    newLastDate = input.nextLong();
                    System.out.println(listOfEvents.getEventsBetweenDates(newStartDate, newLastDate));
                    break;

                case 6: //Shows list sorted by time.
                    for (Event event : listOfEvents.sortEventsByTime()) {
                        System.out.println(event);
                    }
                    break;

                case 7: //Shows list sorted by location (alphabetic order).
                    for (Event event : listOfEvents.sortEventsByLocation()) {
                        System.out.println(event);
                    }
                    break;

                case 8: //Shows list sorted by type of event (alphabetic order).
                    for (Event event : listOfEvents.sortEventsByType()) {
                        System.out.println(event);
                    }
                    break;
            }

        } while (userInputNumber != 9);
        input.close();
    }
}
