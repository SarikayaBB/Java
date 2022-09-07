package src;

import java.util.ArrayList;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        boolean isDivOver = false;
        int EBOB = 1;
        int EKOK = 1;

        System.out.println("İlk sayıyı giriniz : ");
        n1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        n2 = scanner.nextInt();

        while (!isDivOver) {

            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.println(i);
                    EBOB = i;
                } else {
                    isDivOver = true;
                }
            }
        }
        EKOK = n1 * n2 / EBOB;
        System.out.println("EBOB: " + EBOB);
        System.out.println("EKOK: " + EKOK);
    }
}
