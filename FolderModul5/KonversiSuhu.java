import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan suhu dalam derajat Celsius
        System.out.print("Masukkan suhu dalam derajat Celsius: ");
        double suhuCelsius = scanner.nextDouble();

        // Mengonversi suhu dari Celsius ke Fahrenheit
        double suhuFahrenheit = (suhuCelsius * 9/5) + 32;

        // Menampilkan hasil konversi dengan presisi dua desimal
        System.out.printf("Suhu dalam derajat Fahrenheit: %.2f%n", suhuFahrenheit);

        scanner.close();
    }
}
