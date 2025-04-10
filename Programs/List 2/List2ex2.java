import javax.swing.*;

class List2ex2 {
   public static void main (String args [])
   {
      String aS = JOptionPane.showInputDialog("Informe um número: ");
      String bS = JOptionPane.showInputDialog("Informe outro número: ");
      String cS = JOptionPane.showInputDialog("Informe outro número: ");
      
      int aI = Integer.parseInt(aS);
      int bI = Integer.parseInt(bS);
      int cI = Integer.parseInt(cS);
      
      if (cI < aI + bI && aI  < cI+ bI && bI < cI + aI){
         if (aI == bI || bI == cI || aI == cI){
         JOptionPane.showMessageDialog (null, "Triângulo Equilatero");
         
         }
         else if (aI == bI && aI != cI || aI == cI && aI != bI || bI == cI){
         JOptionPane.showMessageDialog (null, "Triângulo Isoceles");
         }
         else if (aI != bI && bI != cI && aI != cI){
         JOptionPane.showMessageDialog (null, "Triângulo Escaleno");
         
         }
         
      }
         else {
          JOptionPane.showMessageDialog (null, "Não é um triângulo");
         }
   }
}