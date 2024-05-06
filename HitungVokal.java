import java.util.Scanner;

public class HitungVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah kata atau kalimat
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine().toLowerCase(); // Mengubah input menjadi lowercase agar tidak case-sensitive

        // Menghitung jumlah huruf vokal dalam kata atau kalimat
        int jumlahVokal = 0;
        for (int i = 0; i < input.length(); i++) {
            char huruf = input.charAt(i);
            if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u') {
                jumlahVokal++;
            }
        }

        // Menampilkan jumlah huruf vokal
        System.out.println("Jumlah huruf vokal dalam kata atau kalimat tersebut: " + jumlahVokal);

        scanner.close();
    }
}
