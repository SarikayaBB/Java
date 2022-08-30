import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
       double pi=3.14, r, alpha, alan, cevre, dilimAlan;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaricap Giriniz: ");
        r = scanner.nextDouble();
        System.out.print("Merkez aci olcusu giriniz: ");
        alpha = scanner.nextDouble();

        cevre = 2*pi*r;
        alan = pi*r*r;
        dilimAlan = (alpha*r*r*pi)/360;
        System.out.print("Cevre: "+cevre + " Alan: "+alan + " Daire dilim alani: " +dilimAlan);




    }





}
