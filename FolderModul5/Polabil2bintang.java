import java.util.Scanner;

public class Polabil2bintang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan sebuah angka bulat: ");
        int angka = input.nextInt();
        if (angka > 0) {
            for (int i = 1; i <= angka; i++) {
                System.out.print(i+ " ");
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Mohon masukan angka bulat positif. ");
        }
        input.close();

    }
    
}
