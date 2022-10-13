import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String a = "Erik Andersson 860314-1234", b;
        int i = a.lastIndexOf(' ')+1;
        int j = a.indexOf('-');
        b = a.substring(i,j);
        System.out.println(b);
        b = a.substring(19,21)+"/"+a.substring(17,19);
        System.out.println(b);

    }
}