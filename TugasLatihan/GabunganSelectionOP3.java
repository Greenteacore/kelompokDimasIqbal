package soloplayer;
import java.util.Scanner;

public class GabunganSelectionOP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan usia: ");
        int usia = input.nextInt();

        System.out.println("Apakah Anda memiliki SIM ? (ya/tidak): ");
        String sim = input.next();

        if (usia >= 18 && sim.equalsIgnoreCase("ya")) {
            System.out.println("Anda dapat mengemudikan mobil. ");
        } else if (usia >= 16 && sim.equalsIgnoreCase("ya")) {
            System.out.println("Anda dapat mengemudikan sepeda motor. ");
        } else {
            System.out.println("Anda tidak dapat mengemudikan kendaraan. ");
        }
    }
    
}
