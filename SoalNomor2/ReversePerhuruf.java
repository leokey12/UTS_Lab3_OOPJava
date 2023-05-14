package SoalNomor2;
    import java.util.Scanner;

    public class ReversePerhuruf {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan kata yang akan direverse: ");
            String stringInput = input.nextLine();
            String stringOutput = "";

            // Loop untuk mereverse string per huruf
            for (int i = stringInput.length() - 1; i >= 0; i--) {
                stringOutput += stringInput.charAt(i)+"";
            }

            System.out.println("Hasil kata setelah direverse: " + stringOutput);
        }
    }


