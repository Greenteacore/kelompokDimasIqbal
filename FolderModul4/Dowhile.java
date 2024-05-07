import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;
        
        do {
            System.out.print("Masukkan bilangan (negatif untuk berhenti): ");
            number = input.nextInt();
            
            if (number > 0) {
                sum += number;
            }
        } while (number >= 0);
        
        System.out.println("Jumlah bilangan positif yang dimasukkan: " + sum);
        input.close();
    }
}
