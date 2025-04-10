import javax.swing.*;

class List2Ex4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Me informe seu nome");

        if (nome != null && !nome.isEmpty()) {
            nome = nome.toLowerCase(); 

            char primeiraLetra = nome.charAt(0);

            if (primeiraLetra >= 'a' && primeiraLetra <= 'k') {
                JOptionPane.showMessageDialog(null, "Você está na sala D1");
            } else if (primeiraLetra >= 'l' && primeiraLetra <= 'n') {
                JOptionPane.showMessageDialog(null, "Você está na sala D2");
            } else if (primeiraLetra >= 'o' && primeiraLetra <= 'z') {
                JOptionPane.showMessageDialog(null, "Você está na sala D3");
            } else {
                JOptionPane.showMessageDialog(null, "Letra inválida para divisão.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum nome foi informado.");
        }
    }
}
