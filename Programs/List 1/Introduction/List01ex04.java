import javax.swing.*; 

class List01ex04 
{
   public static void main (String [] Args)
   {
   String pesoS = JOptionPane.showInputDialog ("Me informe seu peso \n (Ex: 60.2): ");
   float pesoF = Float.valueOf(pesoS);
   
   JOptionPane.showMessageDialog(null, "Seu peso é " +pesoF+ "Kg");
   }
}