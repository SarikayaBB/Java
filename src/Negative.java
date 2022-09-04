import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        int input;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program tek sayı girilene kadar çalışacak ve 4ün katlarını toplayıp ekrana yazdıracak. ");
        do {
            System.out.println("Sayı giriniz: ");
            input = scanner.nextInt();
            if (input % 4 == 0) {
                    sum += input;
                    System.out.println("Girilen sayı: " + input + " Toplam: " + sum);
            }
        }
        while (input % 2 == 0);
    }
}