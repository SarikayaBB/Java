import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km, tutar, minTutar = 20, acilis = 10, kmUcret = 2.20;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilometre giriniz: ");
         km = scanner.nextDouble();
         tutar = acilis+km*kmUcret;

         String str = (tutar <= minTutar) ? "Odemeniz 20TL." : "Odemeniz " + tutar;
         System.out.println(str);

    }










}
