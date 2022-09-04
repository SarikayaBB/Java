import java.sql.SQLOutput;
import java.util.Scanner;

public class OrderOf4n5 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        input = scanner.nextInt();

        System.out.println("4ün kuvvetleri");
        for (int i = 1; i <= input; i *= 4) {

            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("5in kuvvetleri");
        for (int j = 1; j <= input; j *= 5) {

            System.out.print(j + " ");
        }
    }
}

