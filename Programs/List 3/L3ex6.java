import javax.swing.*;

class L3ex6 
{
   public static void main (String args [])
   {
      String numeroS;
      double numeroD;
      double acumulador = 0;
      
      do {
         numeroS = JOptionPane.showInputDialog("Me informe um número");
         numeroD = Double.parseDouble (numeroS);
         
         if (numeroD > 0)
         {
            acumulador = Math.sqrt(numeroD);
            JOptionPane.showMessageDialog (null, "número " +numeroD+ "\n tem raiz quadrada " + acumulador); 
         }
         
         if (numeroD < 0)
         {
          JOptionPane.showMessageDialog (null, "número " +numeroD+ "\n tem raiz quadrada nos complexos, portanto não poderemos demonstrar.");
         }
         
         
      }while (numeroD != -999);
       JOptionPane.showMessageDialog (null, "você digitou número " +numeroD);
   }
 } 