package SoalNomor4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program yang disediakan :");
        System.out.println("1. Hukum Energi Potensial");
        System.out.println("2. Volume kubus");
        System.out.print("Program yang ingin digunakan :");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("massa: ");
                double massa = scanner.nextDouble();
                System.out.print("gravitasi: ");
                double percepatan = scanner.nextDouble();
                System.out.print("ketinggian: ");
                double ketinggian = scanner.nextDouble();


                Fisika hukumEnergiPotensial = new Fisika(massa, percepatan,ketinggian);
                double hasilEnergiPotensial = hukumEnergiPotensial.hitungResult();
                System.out.println("Energi Potensial yang diperoleh : " + hasilEnergiPotensial);
                break;

            case 2:
                System.out.print("panjang rusuk: ");
                double a = scanner.nextDouble();
                Matematika volumeKubus = new Matematika(a);
                double hasilvolumeKubus = volumeKubus.hitungResult();
                System.out.println("Volume Kubus yang diperoleh : " + hasilvolumeKubus);
                break;
             default:
                System.out.println("Rumus tidak tersedia");
                break;
        }
    }
}