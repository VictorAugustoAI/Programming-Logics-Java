import javax.swing.*;


class List01ex05extra 
{
   public static void main (String [] args)
   {
   char [] caracteres = new char [10];
   
   for (int i = 0; i<10; i++)
   {
   String caracter = JOptionPane.showInputDialog("Escreva um caracter: ");
   
   caracteres [i] = caracter.charAt(0);
   
   }
   
   String palavra = "";
   for (int i = 0; i <caracteres.length; i++)
   {
    palavra += caracteres [i];
   }
   
   JOptionPane.showMessageDialog (null, "A palavra é: " +palavra);
   }
}