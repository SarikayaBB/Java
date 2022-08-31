import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        String choice;
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz:");
        n1 = scanner.nextInt();
        System.out.println("Ikinci sayiyi giriniz:");
        n2 = scanner.nextInt();
        System.out.println("Yapmak istediginiz islemi yaziniz: \n* Toplama \n* Cikarma \n* Carpma \n* Bolme");
        scanner.nextLine();
        choice = scanner.nextLine();
        switch (choice) {
            case ("Toplama"):
                System.out.println("Toplam = " + (n1 + n2));
                break;
            case ("Cikarma"):
                System.out.println("Fark = " + (n1 - n2));
                break;
            case ("Bolme"):
                if (n2 == 0){
                    System.out.println("Sayilarin 0'a bolumu tanimsizdir.");
                }else{
                    System.out.println("Bolum = " + (n1/n2));
                    break;
                }
            case ("Carpma"):
                System.out.println("Carpim = " + (n1*n2));
                break;
            default:
                System.out.println("Gecersiz islem.");

        }
    }
}
