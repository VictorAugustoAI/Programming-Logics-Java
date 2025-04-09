import javax.swing.*;

class Ex7 
{
   public static void main (String args[])
   {
      String anguloS = JOptionPane.showInputDialog("Escreva um angulo em graus:");
      double anguloD = Double.parseDouble(anguloS);
      double rad = Math.toRadians(anguloD);
      
      double seno = Math.sin(rad);
      double cos = Math.cos(rad);
      double tg = Math.tan(rad);
      double cotg = 0;
      double cossec = 0;
      double sec = 0;
      
      if(seno != 0 && cos != 0  && tg != 0)
      {
 
      cotg = 1/tg;
      sec = 1/cos;
      cossec = 1/seno;
      }
      
      JOptionPane.showMessageDialog(null, 
            "O ângulo " + anguloS + "° tem:\n" +
            "Seno: " + seno + "\n" +
            "Cosseno: " + cos + "\n" +
            "Tangente: " + tg + "\n" +
            "Cossecante: " + cossec + "\n" +
            "Secante: " + sec + "\n" +
            "Cotangente: " + cotg);
   }
}