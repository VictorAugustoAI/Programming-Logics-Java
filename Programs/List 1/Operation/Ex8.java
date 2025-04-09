import javax.swing.*;

class Ex8 
{
   public static void main(String args[])
   {
   String n1 = JOptionPane.showInputDialog ("Forneça um número:" );
   double n1D = Double.parseDouble (n1);
   
   JOptionPane.showMessageDialog (null, "Log na base 10 do valor "+n1+" \n" + Math.log10(n1D));
   }
}