package src;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        double number;
        double sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tam sayı giriniz: ");
        number = scanner.nextInt();

        for (double i = 1; i<=number;i++){
            sum += 1/i;
        }
        System.out.println("Harmonik seri toplamı= " + sum);
    }
}
