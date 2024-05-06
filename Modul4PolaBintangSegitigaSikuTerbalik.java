public class Modul4PolaBintangSegitigaSikuTerbalik {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris

        // Loop untuk setiap baris
        for (int i = n; i >= 1; i--) {
            // Bintang dari i hingga 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
