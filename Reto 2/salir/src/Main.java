import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextArea question = new JTextArea("¿Quieres salir conmigo?");
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setEditable(false);
        question.setFocusable(false);
        JButton btnSi = new JButton("Sí");
        JButton btnNo = new JButton("No");
        btnNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mueve el botón "No" a una posición aleatoria en la pantalla
                int x = (int)(Math.random() * (frame.getWidth() - btnNo.getWidth()));
                int y = (int)(Math.random() * (frame.getHeight() - btnNo.getHeight()));
                btnNo.setLocation(x, y);
            }
        });
        btnSi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Sabia que dirias que si, UwU");
                System.exit(0);
            }
        });
        JPanel panel = new JPanel();
        panel.add(question);
        panel.add(btnSi);
        panel.add(btnNo);
        frame.add(panel);
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
