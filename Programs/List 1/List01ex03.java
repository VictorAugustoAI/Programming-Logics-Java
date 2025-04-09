import javax.swing.*;

class List01ex03 {
   public static void main (String [] args)
   {
   String date = JOptionPane.showInputDialog ("Fale um dia do mês (Númerico):");
   String mes = JOptionPane.showInputDialog ("Fale um mes");
   String ano = JOptionPane.showInputDialog ("Fale um ano"); 
   
   JOptionPane.showMessageDialog(null, date +"/" + mes +"/" + ano);
   }
}