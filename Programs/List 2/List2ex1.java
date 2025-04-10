
import javax.swing.*;


class List2ex1{

   public static void main (String args[])
   {
      String aS = JOptionPane.showInputDialog("Informe um número: ");
      String bS = JOptionPane.showInputDialog("Informe outro número: ");
      String cS = JOptionPane.showInputDialog("Informe outro número: ");
      
      int aI = Integer.parseInt(aS);
      int bI = Integer.parseInt(bS);
      int cI = Integer.parseInt(cS);
      
      if (cI < aI + bI && aI  < cI+ bI && bI < cI + aI){
         JOptionPane.showMessageDialog(null, "É um triangulo");
      }
      else{
       JOptionPane.showMessageDialog(null, " Não é um triangulo");
   } 
   }
}