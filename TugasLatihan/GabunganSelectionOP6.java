package soloplayer;
import java.util.Scanner;
 
 public class GabunganSelectionOP6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        
        // Selection statement (if-else) dengan operator ?
        String hasil = (angka > 0) ? "Bilangan positif" : (angka < 0) ? "Bilangan negatif" :
        "Nol";
        System.out.println("Angka yang dimasukkan adalah " + hasil);
        
            // Operator aritmatika dengan operator ?
            int x = 5;
            int y = 3;
            int hasilPenjumlahan = x + y;
            int hasilPengurangan = x - y;
            int hasilPerkalian = x * y;
            double hasilPembagian = (y != 0) ? ((double) x / y) : 0;
            
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);
        
        // Selection statement (switch) dengan operator ?
        System.out.print("Masukkan pilihan (A, B, atau C): ");
        char pilihan = input.next().charAt(0);
        
        String teks = (pilihan == 'A') ? "Anda memilih pilihan A" :
        (pilihan == 'B') ? "Anda memilih pilihan B" :
        (pilihan == 'C') ? "Anda memilih pilihan C" :
        "Pilihan yang dimasukkan tidak valid";
        System.out.println(teks);
    }
}