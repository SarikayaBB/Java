package src;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        IsPalindrom(userNumber);
    }


    static void IsPalindrom(int n) {
        int reverse=0; // reverse of the number
        int counter = 0; // How many digits do the number have
        int temp = n; // creating a variable called temp so that after we work on it, the number would not change
        boolean isPal = false;


        while (temp != 0) {  // finding the number of digits of the number
            int digit = temp % 10;
            System.out.println("Sayının Son Basamağı : " + digit);
            counter++; // counting the number's digits
            temp = temp / 10; // creating the new number with 1 less digit
            System.out.println("Yeni Sayı : " + temp);
        }
        temp = n; // we manipulated the temp, so we again make it equal to the given number
        for (int i = counter; i >= 1; i--) { // The loop where we create the reverse number, we decrease the i because it's order is vice-versa
            int digit = temp % 10;
            reverse += Math.pow(10,i-1)*digit; // we create the reverse of the number by multiplying the last digit with corresponding order of 10
            temp = temp / 10;
        }

        if (reverse == n){
            System.out.println(n + " Sayısı Bir Palindrom Sayıdır.");
        } else {
            System.out.println(n + " Sayısı Palindrom Bir Sayı Değildir. ");
        }
    }

}
       /*
        int reverse = 0, counter = 0;

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temporary = number;

        while (temporary > 0) {
            int digit = temporary % 10;
            counter++;
            temporary = temporary / 10;
        }
        temporary = number;
        for (int i = counter; i >= 1; i--) {
            int digit2 = temporary % 10;
            reverse += Math.pow(10, i - 1) * digit2;
            temporary = temporary / 10;
        }
        if (reverse == number) {
            System.out.println(number + " sayısı bir palindrom sayıdır. ");
        } else {
            System.out.println(number + " sayısı palindrom bir sayı değildir.");
        }
*/