import javax.swing.*;

class Ex6 
{
   public static void main (String args[])
   {
   String nS = JOptionPane.showInputDialog ("Escreve um número de 3 casas decimais");
   
   
   JOptionPane.showMessageDialog(null, "O algarismo decimal é: \n" + nS.charAt(1));
   }
   
}