import java.util.ArrayList;
import java.util.Scanner;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        int numberIn;
        int digit = 0;
        int sum = 0;
        ArrayList<Integer> numberAlone = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        numberIn = scanner.nextInt();
        int holderNumberIn = numberIn;
        while (holderNumberIn > 0) {
            System.out.println("Basamaklar sondan başa doğru: " + holderNumberIn % 10);
            numberAlone.add(holderNumberIn % 10);
            holderNumberIn /= 10;
            digit++;
        }
        for (int i = 0; i < digit; i++) {
            sum += Math.pow(numberAlone.get(i), digit);      ///// sum += numberAlone.get(i); şeklinde yazacak olursak sayının basamakları toplamını elde ederiz.
        }
        if (numberIn == sum) {
            System.out.println(numberIn + " sayısı bir Armstrong sayısıdır.");
        } else {
            System.out.println(numberIn + " sayısı bir Armstrong sayısı değildir.");
        }
//        System.out.println(numberAlone);
//        System.out.println(sum);
    }
}
