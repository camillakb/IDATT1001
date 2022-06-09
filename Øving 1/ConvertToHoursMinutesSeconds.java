import javax.swing.JOptionPane;

/**
 * Client that converts seconds into hours + minutes + seconds.
 */

public class ConvertToHoursMinutesSeconds {
    public static void main(String [] args){
        String secondsRead = JOptionPane.showInputDialog("Enter the amount of seconds:");
        int seconds = Integer.parseInt(secondsRead);
        int hours = (seconds / 3600);
        int minutes = ((seconds % 3600)/60);
        int convertedSeconds = (seconds % 60);

        if(hours==1){
            System.out.println(secondsRead + " seconds is the same as " + hours + " hour, " + minutes + " minutes and " + convertedSeconds +
            " seconds.");
        } else {
            System.out.println(secondsRead + " seconds is the same as " + hours + " hours, " + minutes + " minutes and " +
            convertedSeconds + " seconds.");
        }
        }
    }
    
