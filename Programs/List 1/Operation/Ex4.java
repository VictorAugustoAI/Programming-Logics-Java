import javax.swing.JOptionPane;

public class Ex4 {
    public void main (String args []){
        String firstString = JOptionPane.showInputDialog("Type something");
        String secondString = JOptionPane.showInputDialog("Type something again");
        String thirdString = JOptionPane.showInputDialog("Type something one more time");

        int totalLength = firstString.length() + secondString.length() + thirdString.length();

        JOptionPane.showMessageDialog(null, "String are " +totalLength+ " lenght" );
    }
    
}
