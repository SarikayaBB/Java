import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        // verileri tanimlama
        double matematik, fizik, kimya, turkce, tarih, muzik;
        // Scanner tanimlama
        Scanner scanner = new Scanner(System.in);
        // kullanicidan veri alimi
        System.out.print("Matematik notunuzu giriniz:");
        matematik = scanner.nextDouble();

        System.out.print("Fizik notunuzu giriniz");
        fizik = scanner.nextDouble();

        System.out.print("Kimya notunuzu giriniz");
        kimya = scanner.nextDouble();

        System.out.print("Turkce notunuzu giriniz");
        turkce = scanner.nextDouble();

        System.out.print("Tarih notunuzu giriniz");
        tarih = scanner.nextDouble();

        System.out.print("Muzik notunuzu giriniz");
        muzik = scanner.nextDouble();

        double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamaniz " + ortalama);

        String str = ortalama >= 60 ? "Sinifi gecti." : "Sinifta kaldi";
        System.out.print(str);
    }



}
