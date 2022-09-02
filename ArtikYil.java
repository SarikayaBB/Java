import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year = scanner.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.print(year + " bir artık yıldır! ");
            } else {
                System.out.print(year + " artık yıl değildir !");
            }
        } else if (year % 4 == 0) {
            System.out.print(year + " bir artık yıldır! ");
        } else if (year <= 0) {
            System.out.print("Geçersiz yıl girdiniz.");
        } else {
            System.out.print(year + " artık yıl değildir !");
        }
    }
}
