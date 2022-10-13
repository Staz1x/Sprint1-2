package Del4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import static Del4.DiceIgen.createFile;

public class Huvud {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\fogel\\Desktop\\TärningResultat.txt"));
        DiceIgen.createFile();
        DiceIgen.createArray();
        int[] generated = DiceIgen.createArray();
        //DiceIgen.analyzeArray(generated);
        int[] amount = DiceIgen.analyzeArray(generated);
        String toFile = Arrays.toString(amount);
        bw.write("Varje siffra som slagits: \n" + toFile);
        bw.close();
        System.out.println("Varje siffra som slagits: \n" + Arrays.toString(DiceIgen.analyzeArray(generated)));

    }
}
