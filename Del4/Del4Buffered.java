package Del4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Del4Buffered {
    public static void main(String[] args) throws IOException {

        System.out.println("Skriv heltal");
        int sum=0;
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = input.readLine();
            if (s==null)
                break;
            sum+=Integer.parseInt(s);
        }
        System.out.println("Summa: "+sum);



    }
}
