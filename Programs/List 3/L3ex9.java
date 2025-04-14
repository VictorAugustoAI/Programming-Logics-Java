import javax.swing.*;

class L3ex9 
{
   public static void main (String args[])
   {
   
   String n1S = JOptionPane.showInputDialog("Escreva um número: ");
   String n2S = JOptionPane.showInputDialog("Escreva um número: ");
   double n1I = Double.parseDouble (n1S);
   double n2I = Double.parseDouble (n2S);
   
   JOptionPane.showMessageDialog(null, "Você deseja fazer qual Operação?");
   String Ops = JOptionPane.showInputDialog(null, "[1]Soma [2]Subtração [3] Multiplicação [4] Divisão");
   int OpI = Integer.parseInt(Ops);
   
   switch (OpI){
   case 1: 
   double soma = n1I + n2I;
   JOptionPane.showMessageDialog(null, "A soma:" + soma );
   break;
   case 2: 
   double subtracao = n1I - n2I;
   JOptionPane.showMessageDialog(null, "A subtração:" + subtracao );
   break;
   case 3: 
   double multiplicacao = n1I * n2I;
   JOptionPane.showMessageDialog(null, "A multiplicação:" + multiplicacao );
   break;
   case 4:
   if (n2I != 0 ){ 
   double divisao = n1I/n2I;
   JOptionPane.showMessageDialog(null, "A divisão:" + divisao );
   }
   else{
   JOptionPane.showMessageDialog(null, "A divisão impossivel com zero no denominador");
   }
   break;


   }
   }
}