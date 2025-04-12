import javax.swing.*;

class L3ex7
{
   public static void main (String []args)
   {
      int resultado = 0;
     
      for (int i = 1; resultado < 500; i++ ){
         resultado = 5 * i;
         JOptionPane.showMessageDialog(null, "O número está no:" + resultado);  
      }

   }
}