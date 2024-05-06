import java.util.Scanner;

public class CekBilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input bilangan dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Memeriksa apakah bilangan adalah bilangan prima
        boolean prima = true;
        if (bilangan <= 1) {
            prima = false;
        } else {
            for (int i = 2; i <= Math.sqrt(bilangan); i++) {
                if (bilangan % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        // Menampilkan hasil
        if (prima) {
            System.out.println("Bilangan tersebut adalah bilangan prima");
        } else {
            System.out.println("Bilangan tersebut bukan bilangan prima");
        }

        scanner.close();
    }
}