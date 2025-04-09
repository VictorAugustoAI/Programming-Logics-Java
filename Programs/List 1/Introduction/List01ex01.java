import javax.swing.*;

public class List01ex01{
   public static void main (String []args)
   {
      String word1 = JOptionPane.showInputDialog ("Primeira palavra:");
      String word2 = JOptionPane.showInputDialog ("Segunda palavra: ");
      String word3 = JOptionPane.showInputDialog ("Terceira palavra: ");
      
      JOptionPane.showMessageDialog(null, word3 + " " + " "+ word2 + " " + word1);
}
} 