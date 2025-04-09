import javax.swing.*;

public class Ex1 {
    public void main (String args []){

        String ageString = JOptionPane.showInputDialog("How old are you?");
        int ageInt = Integer.parseInt(ageString);
        int daysYear = 365;
        int totalDays = daysYear * ageInt;

        //Given that this is a basic list, we'll start with a simple logic and then refine it for more complex scenarios.

        JOptionPane.showMessageDialog(null, "You have been alive for about " + totalDays + " days");

    }
}