package soloplayer;
import java.util.Scanner;
 public class GabunganOperatorSelection5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();
        
            // Penggunaan operator dan konstruksi pemilihan
            String hasil;
            if (nilai >= 80) {
            hasil = "A";
            } else if (nilai >= 70) {
            hasil = "B";
            } else if (nilai >= 60) {
            hasil = "C";
            } else if (nilai >= 50) {
            hasil = "D";
            } else {
            hasil = "E";
            }
        
        // Cetak hasil
        System.out.println("Hasil ujian: " + hasil);
    }
}
