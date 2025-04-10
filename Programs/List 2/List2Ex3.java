import javax.swing.*;

class List2Ex3 {
   public static void main (String args[]){
      String verbo = JOptionPane.showInputDialog("Conjugue um verbo");
      verbo.toLowerCase();
      
      if (verbo.endsWith("ar")) {
                JOptionPane.showMessageDialog(null, "Verbo da 1ª conjugação (termina em -ar).");
            } else if (verbo.endsWith("er")) {
                JOptionPane.showMessageDialog(null, "Verbo da 2ª conjugação (termina em -er).");
            } else if (verbo.endsWith("ir")) {
                JOptionPane.showMessageDialog(null, "Verbo da 3ª conjugação (termina em -ir).");
            } else if (verbo.endsWith("or") || verbo.endsWith("ur")) {
                JOptionPane.showMessageDialog(null, "Provavelmente nem é verbo no infinitivo (termina em -or ou -ur).");
            } else if (!verbo.endsWith("r")) {
                JOptionPane.showMessageDialog(null, "Não está no infinitivo (não termina em -r).");
            } else {
                JOptionPane.showMessageDialog(null, "Forma não reconhecida.");
            }
      }
   }

