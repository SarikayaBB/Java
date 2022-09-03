import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int input;
        int sum = 0, quantity = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        input = scanner.nextInt();


        for (int i = 1; i < input; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                quantity++;
            }
        }

        System.out.println("Ortalama: " + (sum / quantity));


    }
}
