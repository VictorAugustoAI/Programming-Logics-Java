import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex5 {
    public void main (String args[]){
        JOptionPane.showMessageDialog(null, "Let's calculate the interest on a debt over a few month");
        String valueString = JOptionPane.showInputDialog("How much did you spend on credit?");
        double valueDouble = Double.parseDouble(valueString);
        String intereString = JOptionPane.showInputDialog(null, "What is the interest on your card? \n In percentage");
        double intereDouble = Double.parseDouble(intereString);
        String monthString = JOptionPane.showInputDialog("How mlong, in month, you owe?");
        int monthInt = Integer.parseInt(monthString);

        double valueFinal =  valueDouble * Math.pow((1+intereDouble/100), monthInt);

        // Assuming valueFinal is a double or float
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String formattedValue = df.format(valueFinal);

        JOptionPane.showMessageDialog(null, "In "+monthInt+ "months you will owe \n R$" + formattedValue);



    }
    
}
