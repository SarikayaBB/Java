import java.util.Scanner;

public class OrderOfNumbers {
    public static void main(String[] args) {
        int number, order;
        int output = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        number = scanner.nextInt();

        System.out.println("Kuvvetini giriniz: ");
        order = scanner.nextInt();

        for (int i = 1; i <= order; i++) {
            output *= number;
        }
        System.out.println("Sonuç: " + output);

    }
}
