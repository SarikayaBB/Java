import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        double distance, kmPrice = 0.1, totalPrice, discountPrice;
        int trip, age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilometre cinsinden mesafe giriniz: ");
        distance = scanner.nextDouble();

        System.out.print("Yaş giriniz: ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipi Tek-Yön ise 1, Gidiş-Dönüş ise 2 giriniz: ");
        trip = scanner.nextInt();

        totalPrice = kmPrice * distance;
        if (distance > 0) {
            if (trip == 1) {
                totalPrice = kmPrice * distance;
                if (age > 0 && age < 12) {
                    discountPrice = totalPrice / 2;
                    System.out.print("Toplam tutar: " + discountPrice);
                } else if (age >= 12 && age <= 24) {
                    discountPrice = totalPrice - totalPrice * (0.1);
                    System.out.print("Toplam tutar: " + discountPrice);
                } else if (age > 24 && (age < 65)) {
                    discountPrice = totalPrice;
                    System.out.print("Toplam tutar: " + discountPrice);
                } else if (age >= 65) {
                    discountPrice = totalPrice - totalPrice * (0.3);
                    System.out.print("Toplam tutar: " + discountPrice);
                } else {
                    System.out.print("Hatalı veri girdiniz.");
                }
            } else if (trip == 2) {
                totalPrice = kmPrice * distance * 2;
                if (age > 0 && age < 12) {
                    discountPrice = totalPrice / 2;
                    System.out.print("Toplam tutar: " + discountPrice);
                } else if (age >= 12 && age <= 24) {
                    discountPrice = totalPrice - totalPrice * (0.1);
                    discountPrice = discountPrice - discountPrice * (0.2);
                    System.out.print("Toplam tutar: " + discountPrice);
                } else if (age > 24 && age < 65) {
                    discountPrice = totalPrice;
                    discountPrice = discountPrice - discountPrice * (0.2);
                    System.out.print("Toplam tutar: " + discountPrice);
                } else if (age >= 65) {
                    discountPrice = totalPrice - totalPrice * (0.3);
                    discountPrice = discountPrice - discountPrice * (0.2);
                    System.out.print("Toplam tutar: " + discountPrice);
                } else {
                    System.out.print("Hatalı veri girdiniz.");
                }
            } else {
                System.out.print("Hatalı veri girdiniz.");
            }
        } else {
            System.out.print("Hatalı veri girdiniz.");
        }


    }

}
