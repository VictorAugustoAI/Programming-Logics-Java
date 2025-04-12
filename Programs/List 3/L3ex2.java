import javax.swing.*;

class L3ex2 {
   public static void main (String args[]){
     int resultado = 0;
     
      for (int i = 1; i <= 50; i++ ){
         resultado = 2 * i;
         JOptionPane.showMessageDialog(null, "O número está no:" + resultado);  
      }
      
   }
}