package Del2;
import javax.swing.*;

public class Del2 {
    public static void main(String[] args) {

        int minuter;
        double pris = 0;
        minuter = Integer.parseInt(JOptionPane.showInputDialog(null, "Hur många minuter?"));
        int knapp = JOptionPane.showConfirmDialog(null, "Är samtalet dagtid?");
        if (knapp == 0) {
            pris = 0.6 + (minuter*2.5);
        } else if (knapp == 1) {
            pris = 0.6 + (minuter*0.55);
        } else {
            JOptionPane.showMessageDialog(null, "Avbrutet");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Samtalspris är : "+pris);
    }
}
