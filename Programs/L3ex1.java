import javax.swing.*;

class L3ex1 {
   public static void main (String args[]){
      int number = 100;
      do {
         number = number - 1;
         JOptionPane.showMessageDialog(null, "O número está no:" + number);  
       
      }while (number > 0);
       
      JOptionPane.showMessageDialog(null, "O número chegou no 0");  
   }
}