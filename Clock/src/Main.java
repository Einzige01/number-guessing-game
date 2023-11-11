import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int MAX = 100;
        int int_random = rand.nextInt(MAX);
        Scanner Raten = new Scanner(System.in);
        System.out.println("Rate die ausgedachte Zahl");
        int Raten1;
        do {
            Raten1 = Raten.nextInt();
            if (Raten1 < int_random) {
                System.out.println("Falsch, die Zahl ist größer als " + Raten1 + ". Versuche es erneut!");
            } else if (Raten1 > int_random) {
                System.out.println("Falsch, die Zahl ist kleiner als " + Raten1 + ". Versuche es erneut!");
            } else {
                System.out.println("Richtig, die Zahl ist " + Raten1);
            }
        } while (Raten1 != int_random);
    }
}