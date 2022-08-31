import java.util.Scanner;

public class OrtalamaV2 {
    public static void main(String[] args) {
//        double mat,fizik,turkce,kimya,muzik,ortalama;

        double ortalama;

        double[] notlar = new double[5];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        notlar[0] = scanner.nextDouble();

        System.out.print("Fizik notunuz: ");
        notlar[1] = scanner.nextDouble();

        System.out.print("Turkce notunuz: ");
        notlar[2] = scanner.nextDouble();

        System.out.print("Kimya notunuz: ");
        notlar[3] = scanner.nextDouble();

        System.out.print("Muzik notunuz: ");
        notlar[4] = scanner.nextDouble();
        double sum = 0;
        int bolen = 0;
        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i] <= 100 && notlar[i] >= 0) {
                sum = sum + notlar[i];
                bolen++;
            } else {
                System.out.println(notlar[i] + ", 0 ve 100 araliginda degil.");
            }

        }
        ortalama = sum / bolen;
        if (ortalama >= 55) {
            System.out.print("Ortalamaniz: " + ortalama + "\n Gectiniz tebrikler.");
        } else {
            System.out.print("Ortalamaniz: " + ortalama + "\n Sinifta kaldiniz. ");
        }


    }
}
