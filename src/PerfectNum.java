package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum=0;
        System.out.print("Bir Sayı Giriniz : ");
        number = scanner.nextInt();

        for (int i = 1; i<number;i++){
            if (number % i == 0) {
            sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " sayısı bir mükemmel sayıdır.");
        } else {
            System.out.println(number + " sayısı mükemmel sayı değildir.");
        }



    }
}
