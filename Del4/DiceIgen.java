package Del4;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class DiceIgen {

    public static void createFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\fogel\\Desktop\\Tärning.txt"));
        int number;
        Random random = new Random();
        for(int i=0; i<1000; i++) {
            number = random.nextInt(6)+1;
            bw.write(number +" ");
        }
        bw.close();
    }
    public static int[] createArray() throws IOException {
        Scanner scan = new Scanner(new File("C:\\Users\\fogel\\Desktop\\Tärning.txt"));
        int [] generated = new int[1000];
        int index = 0;
        while(scan.hasNextInt()) {
            generated[index++] = scan.nextInt();
        }
        return generated;
    }
    public static int[] analyzeArray(int[] diceRoll) {
        int [] numberOfRolls = new int[6];
        for (int onDice : diceRoll) {
            if(onDice==1) {
                numberOfRolls[0]++;
            } else if (onDice==2) {
                numberOfRolls[1]++;
            } else if (onDice==3) {
                numberOfRolls[2]++;
            } else if (onDice==4) {
                numberOfRolls[3]++;
            } else if (onDice==5) {
                numberOfRolls[4]++;
            }else {
                numberOfRolls[5]++;
            }
        }
        return numberOfRolls;
    }
}
