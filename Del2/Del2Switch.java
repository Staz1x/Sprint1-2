package Del2;

import javax.swing.*;

public class Del2Switch {
    public static void main(String[] args) {

        int minuter;
        double pris = 0;
        minuter = Integer.parseInt(JOptionPane.showInputDialog(null, "Hur många minuter?"));
        int knapp = JOptionPane.showConfirmDialog(null, "Är samtalet dagtid?");
        switch(knapp) {
            case 0 -> pris = 0.6 + (minuter*2.5);
            case 1 -> pris = 0.6 + (minuter*0.55);
            default -> JOptionPane.showMessageDialog(null, "Avbrutet");
        }
        JOptionPane.showMessageDialog(null, "Samtalspris är : "+pris);

    }
}
