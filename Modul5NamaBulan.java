import java.util.Scanner;

public class Modul5NamaBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan angka bulan
        System.out.print("Masukkan angka bulan (1-12): ");
        int angkaBulan = scanner.nextInt();

        // Mengonversi angka bulan menjadi nama bulan
        String namaBulan;
        switch (angkaBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = null;
        }

        // Menampilkan nama bulan atau pesan kesalahan
        if (namaBulan != null) {
            System.out.println("Nama bulan: " + namaBulan);
        } else {
            System.out.println("Angka bulan tidak valid");
        }

        scanner.close();
    }
}
