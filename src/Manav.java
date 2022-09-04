import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates = 1.11, muz=0.95, patlican=5.00;
        double armutFiyat, elmaFiyat, domatesFiyat, muzFiyat, patlicanFiyat, toplamTutar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut kac kilogram? ");
        armutFiyat = scanner.nextDouble()*armut;

        System.out.print("Elma kac kilogram? ");
        elmaFiyat = scanner.nextDouble()*elma;

        System.out.print("Domates kac kilogram? ");
        domatesFiyat= scanner.nextDouble()*domates;

        System.out.print("Muz kac kilogram? ");
        muzFiyat = scanner.nextDouble()*muz;

        System.out.print("Patlican kac kilogram? ");
        patlicanFiyat= scanner.nextDouble()*patlican;

        toplamTutar = armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
        System.out.print("Toplam tutar "+ toplamTutar+ " liradir.");


    }


}
