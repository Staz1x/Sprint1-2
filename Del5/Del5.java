package Del5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Del5 {
    public static void main(String[] args) throws IOException {

        System.out.println("Skriv några heltal");
        int biggest=0;
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = input.readLine();
            if (s == null)
                break;
            if(biggest<Integer.parseInt(s))
                biggest=Integer.parseInt(s);

        }
        System.out.println("Största talet är: "+biggest);

    }
}
