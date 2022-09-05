package src;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName, password;
        int right = 3, balance = 1500;

        int choice;

        while (right > 0) {
            System.out.println("Kullanıcı adınız: ");
            userName = scanner.nextLine();

            System.out.println("Şifreniz: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz! ");

                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz. \n 1-Para yatırma \n 2- Para çekme \n 3- Bakiye sorgula \n 4- Çıkış yap.");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Mevcut bakiyeniz: " + balance);
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            int add = scanner.nextInt();
                            balance += add;
                            System.out.println("Yatırılan para: " + add + " mevcut bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.println("Mevcut bakiyeniz: " + balance);
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            int sub = scanner.nextInt();
                            if (sub > balance) {
                                System.out.println("Yetersiz bakiye. ");
                            } else {
                                balance -= sub;
                                System.out.println("Çekilen para: " + sub + " mevcut bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz: " + balance);
                            break;
                    }
                } while (choice != 4);
                {
                    System.out.println("Çıkış yaptınız.");
                    break;
                }
            } else {
                System.out.println("HataLı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz.");
                right--;
                if (right != 0) {
                    System.out.println("Kalan deneme hakkınız: " + right);
                } else {
                    System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz.");
                }
            }
        }
    }
}
