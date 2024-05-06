package soloplayer;

import java.util.Scanner;
 
    public class ProgramGabungan {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
 
            if (nilai >= 0 && nilai <= 100) {
            String keterangan;
 
             if (nilai >= 90) {
            keterangan = "A";
            } else if (nilai >= 80) {
            keterangan = "B";
            } else if (nilai >= 70) {
            keterangan = "C";
            } else if (nilai >= 60) {
            keterangan = "D";
            } else {
            keterangan = "E";
        }
 
        System.out.println("Nilai: " + nilai);
        System.out.println("Keterangan: " + keterangan);
 
            switch (keterangan) {
        case "A":
        System.out.println("Pertahankan prestasimu!");
        break;
        case "B":
        System.out.println("Bisa lebih baik lagi!");
        break;
        case "C":
        System.out.println("Perlu lebih banyak belajar.");
        break;
        case "D":
        System.out.println("Perlu meningkatkan usaha.");
        break;
        case "E":
        System.out.println("Belajar lebih giat lagi!");
        break;
        default:
        System.out.println("Keterangan tidak valid.");
        break;
        }
        } else {
        System.out.println("Nilai tidak valid.");
        }
    }
}