package Del4;
import java.io.*;
//Ofärdig
public class Del4 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int a = Integer.parseInt(s);
        s = input.readLine();
        int b = Integer.parseInt(s);


        System.out.println("talet: "+a+" har fakultet: "+nfak(a));

    }
    public static double nfak(double n) {
        double sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }return sum;
    }
    public static void printer(int a, int b) {

    }
}
