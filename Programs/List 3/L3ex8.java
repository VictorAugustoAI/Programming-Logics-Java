import javax.swing.*;

class L3ex8 
{
   public static void main (String args[])
   {
      int resultado = 0;
      
      for (int i = 1; i <= 100; i++)
      {
         int soma = i;
         resultado = soma + resultado;
         
         JOptionPane.showMessageDialog(null, "A contagem está: "+i);
         
      }
      
      JOptionPane.showMessageDialog(null, "A contagem está: "+resultado);
   
   }
}