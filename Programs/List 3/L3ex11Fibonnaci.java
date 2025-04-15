import javax.swing.*;

class L3ex11Fibonnaci {

   public static void main (String args[]){
      String termoS = JOptionPane.showInputDialog("Escreva o termo: ");
      int termoI = Integer.parseInt(termoS); 
      int a = 0;
      int b = 1;
   
      while (b <= termoI){
         int soma = a+b;
         a = b;
         b = soma;
         JOptionPane.showMessageDialog(null, "soma "+b+" + "+a);

      }
      
      JOptionPane.showMessageDialog(null, "O termo do fibonnaci igual ou próximo ao número inserido: "+b);
   }
}