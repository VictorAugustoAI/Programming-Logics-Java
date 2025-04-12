import javax.swing.*;

class L3ex3 {
   public static void main (String args[]){
      JOptionPane.showMessageDialog (null, "Digite 0 caso queira parar" );
      String n1S;
      int n1I;
      int acc = 0;
      int i = 0;
      
      do {
            
         n1S = JOptionPane.showInputDialog("Digite um número");
         n1I = Integer.parseInt (n1S); 
         if (n1I != 0){
            acc = acc+n1I;  
            i++;
         }
            
      } while (n1I != 0);
         
      double media = acc/i;
      JOptionPane.showMessageDialog (null, "A média foi " + media);
   }

}
