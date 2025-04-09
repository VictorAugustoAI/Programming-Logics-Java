import javax.swing.*;

class Ex9
{
   public static void main (String args [])
   {
   String baseS = JOptionPane.showInputDialog("Digite uma base para o calculo logaritimico:");
   double baseD = Double.parseDouble(baseS);
   String n1S = JOptionPane.showInputDialog("Digite um número para o calculo logaritimico:");
   double n1D = Double.parseDouble(n1S);
   
   double resultado = Math.log(n1D) / Math.log(baseD) ;
   
   JOptionPane.showMessageDialog(null, "O resultado é " +resultado);

   }
}