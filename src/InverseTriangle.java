package src;

import java.util.Scanner;

public class InverseTriangle {
    public static void main(String[] args) {
        int row;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Satır sayısı giriniz : ");
        row = scanner.nextInt();

        for (int i = row; i >= 1; i--) {
            for (int j = row - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}