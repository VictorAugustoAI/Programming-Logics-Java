import javax.swing.*;

class List01ex02
{
   public static void main (String [] Args)
   {
      String n1 = JOptionPane.showInputDialog("Escreva um número: ");
      int numberInt = Integer.parseInt(n1);
      
      JOptionPane.showMessageDialog(null, "Número digitado é: \n" + n1);
   }
}