import java.util.Scanner;

public class Sicaklik {
    public static void main(String[] args) {
        double sicaklik;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava sıcaklığını derece cinsinden giriniz: ");
        sicaklik = scanner.nextDouble();

        if ((-15 <= sicaklik) && (sicaklik <= 5.0)) {
            System.out.print("Kayak yapabilirsin.");
        } else if ((5 < sicaklik) && (sicaklik <= 15)) {
            System.out.print("Sinemaya gidebilirsin.");
        } else if ((15 < sicaklik) && (sicaklik <= 25)) {
            System.out.print("Piknik yapabilirsin.");
        } else if ((25<sicaklik) && (sicaklik <= 40)) {
            System.out.print("Yüzmeye gidebilirsin.");
        } else {
            System.out.print("Evde kal !");
        }


    }


}
