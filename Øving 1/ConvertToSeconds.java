import javax.swing.JOptionPane; 

/**
 * Client that convert hours + minutes + seconds into seconds.
 */

public class ConvertToSeconds {
    public static void main(String [] args){ 
        String hours = JOptionPane.showInputDialog("Enter the amount of hours:");
        String minutes = JOptionPane.showInputDialog("Enter the amount of minutes:");
        String seconds = JOptionPane.showInputDialog("Enter the amount of seconds:");

        int resultTimer = Integer.parseInt(hours);
        int resultMinutt = Integer.parseInt(minutes);
        int resultSekund = Integer.parseInt(seconds);

        System.out.println(hours + " hours, " + minutes + " minutes and " + seconds + " seconds is the same as " + 
        (resultTimer * 3600+ resultMinutt * 60 + resultSekund + " seconds."));
}
}
    
    
