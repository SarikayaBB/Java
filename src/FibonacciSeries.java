package src;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOutputs;
        int sum = 1;
        int first = 0, second = 1;


        System.out.println("Seri büyüklüğünü giriniz : ");
        numberOfOutputs = scanner.nextInt();

        System.out.print("0 ");
        for (int i = 1; i <= numberOfOutputs; i++) {
            System.out.print(sum + " ");
            sum = first + second;
            first = second;
            second = sum;
        }
    }


}

