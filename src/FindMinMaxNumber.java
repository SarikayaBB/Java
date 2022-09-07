package src;


import java.util.Arrays;
import java.util.Scanner;

public class FindMinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int max = 1, min = 1;

        System.out.println("Kaç adet sayı gireceksiniz: ");
        input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.println("Sayı Giriniz : ");
            int number = scanner.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En küçük sayı : " + min + "\nEn büyük sayı : " + max);

    }
}



