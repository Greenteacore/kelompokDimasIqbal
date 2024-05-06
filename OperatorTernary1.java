package soloplayer;

import java.util.Scanner;

public class OperatorTernary1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = input.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka yang di masukan adalah " + hasil);
    }
}