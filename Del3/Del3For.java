package Del3;

import java.util.*;

public class Del3For {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Räntesats?");
        double ränta = scan.nextDouble();
        System.out.println("År?");
        int år = scan.nextInt();
        double pengar = 1000;
        for(int i=1; i<=år; i++){
            pengar=pengar+pengar*0.01*ränta;
            System.out.println(i+" "+(int)pengar);
        }

    }
}
