import java.util.Scanner;

public class BurcBulma {

    public static void main(String[] args) {
        int day;
        String mounth;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğdunuz ay: ");
        mounth = scanner.nextLine();

        System.out.print("Doğduğunuz gün: ");
        day = scanner.nextInt();

        if (mounth.equals("Mart")) {
            if (day >= 21 && day <= 31) {
                System.out.print("Koç burcusunuz.");
            } else if (day >= 1 && day < 21) {
                System.out.print("Balık burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Nisan")) {
            if (day >= 21 && day <= 31) {
                System.out.print("Boğa burcusunuz.");
            } else if (day >= 1 && day < 21) {
                System.out.print("Koç burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Mayıs")) {
            if (day >= 22 && day <= 31) {
                System.out.print("İkizler burcusunuz.");
            } else if (day >= 1 && day < 22) {
                System.out.print("Boğa burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Haziran")) {
            if (day >= 23 && day <= 31) {
                System.out.print("Yengeç burcusunuz.");
            } else if (day >= 1 && day < 23) {
                System.out.print("İkizler burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Temmuz")) {
            if (day >= 23 && day <= 31) {
                System.out.print("Aslan burcusunuz.");
            } else if (day >= 1 && day < 23) {
                System.out.print("Yengeç burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Ağustos")) {
            if (day >= 23 && day <= 31) {
                System.out.print("Başak burcusunuz.");
            } else if (day >= 1 && day < 23) {
                System.out.println("Aslan burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Eylül")) {
            if (day >= 23 && day <= 31) {
                System.out.print("Terazi burcusunuz.");
            } else if (day >= 1 && day < 23) {
                System.out.print("Başak burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Ekim")) {
            if (day >= 23 && day <= 31) {
                System.out.print("Akrep burcusunuz.");
            } else if (day >= 1 && day < 23) {
                System.out.print("Terazi burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Kasım")) {
            if (day >= 22 && day <= 31) {
                System.out.print("Yay burcusunuz.");
            } else if (day >= 1 && day < 22) {
                System.out.print("Akrep burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Aralık")) {
            if (day >= 22 && day <= 31) {
                System.out.print("Oğlak burcusunuz.");
            } else if (day >= 1 && day < 22) {
                System.out.print("Yay burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Ocak")) {
            if (day >= 22 && day <= 31) {
                System.out.print("Kova burcusunuz.");
            } else if (day >= 1 && day < 22) {
                System.out.print("Oğlak burcusunuz.");
            } else {
                System.out.print("Geçersiz gün girdiniz.");
            }
        } else if (mounth.equals("Şubat")) {
            if (day >= 20 && day <= 29) {
                System.out.print("Balık burcusunuz.");
            } else if (day >= 1 && day < 20) {
                System.out.print("Kova burcusunuz.");
            }
        } else {
            System.out.print("Geçersiz ay girdiniz. Büyük harf ile başlayarak yazınız.");
        }


    }
}
