import javax.swing.*;

class L3ex4 
{
   public static void main (String args[])
   {
      String contadorS;
      int contadorI;
      int i = 0;
    
      do {
         contadorS = JOptionPane.showInputDialog("Informe um número");
         contadorI = Integer.parseInt(contadorS);
      
         if (contadorI >= 100 && contadorI <= 200)
         {
            i++;
         }
         else {
            i=i; 
         }
      
      }while (contadorI != 0);
      JOptionPane.showMessageDialog(null, "Você digitou exatamente " + i + " números entre 100 e 200");
   
   }
}