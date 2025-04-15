import javax.swing.*;

class L3ex10  {
   public static void main (String args[]){
      String n1 = JOptionPane.showInputDialog("Insira um número para calcularmos o fatorial: ");
      int n1I = Integer.parseInt (n1);
      int fatorial = 1;
      for (int i = 1; i <= n1I; i++){
     
      
         if (n1I != 0){
            fatorial = fatorial * i;
         
         }
         else{
         JOptionPane.showMessageDialog(null, "O fatorial de " + n1I + " é: 1");
         }
         
      }
      
      JOptionPane.showMessageDialog(null, "O fatorial de " + n1I + " é: " + fatorial);
   }

}