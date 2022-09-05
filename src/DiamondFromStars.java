package src;
import java.util.Scanner;

public class DiamondFromStars {
    public static void main(String[] args) {
        int rows;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        rows = scanner.nextInt();


        for (int i = 1; i <= rows; i++) {   // Satır sayısını oluşturan döngü
            for (int k = 1; k <= rows - i; k++) {  // Boşluk oluşturan döngü
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) { // yıldız oluşturan döngü ( i ye bağlı olmasının sebebi yıldızın boşluktan sonra eklenmesi
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = rows - 1; l >= 1; l--) { // Satırları tersten oluşturmak için döngü (-1 olmasının sebebi bir en büyük satırın simetri ekseni olması)
            for (int m = rows - l; m >= 1; m--) {  // Boşlukları oluşturmak için döngü ( rows-l boşluk sayısı örüntüsünü sağlıyor  )
                System.out.print(" ");
            }
            for (int n = (2 * l) - 1; n >= 1; n--) { // Yıldızları basan döngü (2*l-1 ifadesi simetri ekseninin üstü ile aynı. Eşit sayıda yıldız var.
                System.out.print("*");                 //  Boşlukların aksine yıldız sayısı iki döngüde de benzer şekilde.
            }
            System.out.println();
        }
    }
}
//             *     1 4 1
//            ***    2 3 3
//           *****   3 2 5
//          *******  4 1 7
//         ********* 5 0 9
//          *******  4 1 7
//           *****   3 2 5
//            ***    2 3 3
//             *     1 4 1
