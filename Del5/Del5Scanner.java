package Del5;

import java.util.Scanner;

public class Del5Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double pris = readDouble(scan, "Varans pris?");
        double moms = readDouble(scan, "Moms i procent?");
        double exMoms = pris - (pris * moms * 0.01);
        System.out.println("Pris utan moms är "+exMoms);


    }
    static double readDouble(Scanner scan, String txt) {
        System.out.println(txt);
        while (!scan.hasNextDouble()) {
            if (!scan.hasNext())
                System.exit(0);
            scan.nextLine();
            System.out.println("Felaktigt");
        }
        return scan.nextDouble();
    }
}
