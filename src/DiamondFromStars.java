package src;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class DiamondFromStars {
    public static void main(String[] args) {
        int rows;
        int spaces;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        rows = scanner.nextInt();


        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = rows - 1; l >= 1; l--) {
            for (int m = rows - l; m >= 1; m--) {
                System.out.print(" ");
            }
            for (int n = (2 * l) - 1; n >= 1; n--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
