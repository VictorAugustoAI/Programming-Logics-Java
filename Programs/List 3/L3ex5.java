import javax.swing.*;
import java.util.ArrayList;

class L3ex5 
{
   public static void main (String args[])
   {
      String nomes;
      ArrayList <String> nome = new ArrayList<>();
      
      
      do {
      nomes = JOptionPane.showInputDialog("me informe um nome");
      nome.add(nomes);
      nomes = nomes.toUpperCase();
      
      }while (!nomes.equals ("FIM"));
      
      JOptionPane.showMessageDialog(null, "Os nomes que você digitou foram" + nome);
   }
}