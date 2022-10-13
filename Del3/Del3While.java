package Del3;

import java.util.Scanner;

public class Del3While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studs = 0;
        System.out.println("Höjd");
        double höjd = scan.nextDouble();
        while (höjd > 0.01) {
            höjd = höjd * 0.7;
            studs++;
        }

        System.out.println("Bollen studsar " + studs + " ggr innan den stannar");
    }
}
