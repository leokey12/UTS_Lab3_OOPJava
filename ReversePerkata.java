package SoalNomor2;
import java.util.Scanner;

public class ReversePerkata{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String stringInput = input.nextLine();
        String[] words = stringInput.split(" ");
        String stringOutput = "";

        // Loop untuk mereverse string per kata
        for (int i = words.length - 1; i >= 0; i--) {
            stringOutput += words[i] + " ";
        }

        System.out.println("Kalimat setelah diacak: " + stringOutput.trim());
    }
}