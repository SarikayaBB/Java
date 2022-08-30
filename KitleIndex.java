import java.util.Scanner;

public class KitleIndex {
    public static void main(String[] args) {
        double kilo, boy, kitleIndex;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = scanner.nextDouble();

        System.out.print("Kilonuzu giriniz:");
        kilo = scanner.nextDouble();

        kitleIndex = kilo/(boy*boy);
        System.out.print("Vucut kitle indexsiniz: " +kitleIndex);



    }




}
