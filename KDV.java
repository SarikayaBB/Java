import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        // Scanner tanimlama
        Scanner scanner = new Scanner(System.in);
        double KDV, fiyatKDV, kullaniciPara, tutarKDV;
        System.out.print("KDV hesaplanmasini istediginiz tutari giriniz ");
        kullaniciPara=scanner.nextDouble();

        if (kullaniciPara>0&&kullaniciPara<1000){
            KDV = 0.18;
        } else { KDV =0.8; }

            fiyatKDV = kullaniciPara+kullaniciPara*KDV;
            tutarKDV = kullaniciPara*KDV;
        System.out.println("KDVsiz fiyat " + kullaniciPara);
        System.out.println("KDVli fiyat " + fiyatKDV);
        System.out.println("KDV tutari " + tutarKDV);




    }



}
