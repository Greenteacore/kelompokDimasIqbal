public class Forr {
    public static void main(String[] args) {
        int n = 20; // Jumlah bilangan yang ingin ditampilkan

        System.out.println("Deret bilangan genap:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
