import java.sql.SQLOutput;
import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        String userName, password, reset, yeniSifre;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanici adi giriniz: ");
        userName = scanner.nextLine();

        System.out.print("Sifre giriniz: ");
        password = scanner.nextLine();

        if (userName.equals("patika")) {
            if (password.equals("java123")) {
                System.out.println("Giris yaptiniz.");
            } else {
                System.out.println("Sifre hatali.");
                System.out.println("Sifre sifirlamak ister misiniz? \n* Evet \n* Hayir");
                reset = scanner.nextLine();
                if (reset.equals("Evet")) {
                    System.out.println("Yeni sifre giriniz: ");
                    yeniSifre = scanner.nextLine();
                    if (yeniSifre.equals("java123")) {
                        System.out.println("Lutfen farkli bir sifre giriniz.");
                    } else {
                        password = yeniSifre;
                        System.out.println("Sifreniz degistirildi.");
                    }
                } else if(reset.equals("Hayir")) {
                    System.out.println("Sifrenizi degistirmek istemiyorsunuz.");
                } else {
                    System.out.println("Gecersiz islem.");
                }
            }
        } else {
            System.out.println("Hatali kullanici adi girdiniz.");
        }
    }
}

