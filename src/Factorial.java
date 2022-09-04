import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, r;
        int nFactorial = 1;
        int rFactorial = 1;
        int diffFactorial =1;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Küme eleman sayısını giriniz: ");
        n = scanner.nextInt();
        System.out.println("Kaçlı kombinasyon olacağını giriniz: ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
        for (int j = 1; j <= r; j++) {
            rFactorial *= j;
        }
        for (int k = 1; k<=(n-r);k++){
            diffFactorial *= k;
        }
        System.out.println("Kombinasyon= " + nFactorial/(rFactorial*diffFactorial));
    }
}


