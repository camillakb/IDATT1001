import javax.swing.JOptionPane;

/**
 * Client to check if a year is a leap year.
 */

class LeapYear {
    public static void main(String [] args){
        String yearRead = JOptionPane.showInputDialog("Check if this year is a leap year. \nEnter the year you want to check:");

        int leapYearRead = Integer.parseInt(yearRead);

        if (leapYearRead % 4 == 0) {
            if (leapYearRead % 100 == 0) {
                if (leapYearRead % 400 == 0) {
                    System.out.println(yearRead + " is a leap year!");
                } else {
                    System.out.println(yearRead + " is not a leap year.");
                }
            } else {
                System.out.println(yearRead + " is a leap year!");
            }
        } else {
            System.out.println(yearRead + " is not a leap year.");
        }
    }
}