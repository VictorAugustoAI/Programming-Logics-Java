import javax.swing.JOptionPane;

public class Ex3 {
    public void main (String args[]){
        JOptionPane.showMessageDialog(null,"Let's calculus a number squared");
        String numberString = JOptionPane.showInputDialog("First, give me a number");
        int numberInt = Integer.parseInt(numberString);

        int calculusInt = (int) Math.pow(numberInt, 2);

        JOptionPane.showMessageDialog(null, "Result below: \n " + calculusInt);

    }    
}
