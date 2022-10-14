package Del5;
import java.util.Scanner;

public class Del5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv några heltal");
        int sum = 0;
        while (scan.hasNext()) {
            int i = scan.nextInt();
            sum = sum + i;
        }
        System.out.println("Summan är " + sum);

    }
}
