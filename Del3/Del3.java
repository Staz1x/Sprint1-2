package Del3;

import java.util.Objects;
import java.util.Scanner;

public class Del3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv första talet");
        double a = scan.nextDouble();
        System.out.println("Skriv andra talet");
        double b = scan.nextDouble();
        System.out.println("Vill du gångra eller dela? m/d");
        scan.nextLine();
        String s = scan.nextLine();
        if(s.equals("m")) {
            double result = Räkna.multi(a,b);
            System.out.println(result);
        } else if (s.equals("d")) {
            double result = Räkna.divide(a,b);
            System.out.println(result);
        }else
            System.out.println("Felaktig input");

    }

}
class Räkna {
    static double multi(double a, double b) {
        return a*b;
    }
    static double divide(double a, double b) {
        return a/b;
    }
}
