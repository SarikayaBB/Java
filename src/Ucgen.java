import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {

        // Scanner tanimlama
        Scanner scanner = new Scanner(System.in);
        // girdi tanimlama
        double kenarBir, kenarIki, alan, cevre, hipo;

        System.out.println("1. Kenar uzunlugunu giriniz: ");
        kenarBir = scanner.nextDouble();
        System.out.println("2. Kenar uzunlugunu giriniz: ");
        kenarIki = scanner.nextDouble();

        hipo= Math.sqrt((kenarBir*kenarBir)+(kenarIki*kenarIki));
        alan = (kenarBir*kenarIki)/2;
        cevre = (kenarBir+kenarIki+hipo);

        System.out.println("Hipotenus: " + hipo + " alan: "+ alan + " cevre: " + cevre);





    }


}

