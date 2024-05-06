public class Modul4CetakWhilee {
    public static void main(String[] args) {
        int n = 15; // Jumlah bilangan yang ingin ditampilkan

        System.out.println("Deret bilangan ganjil:");
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
