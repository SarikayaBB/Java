import java.util.Scanner;

public class NumberOrdering {
    public static void main(String[] args) {
        double n1, n2, n3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk sayıyı giriniz: ");
        n1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextDouble();

        System.out.print("Ilk sayıyı giriniz: ");
        n3 = scanner.nextDouble();

        if ((n1 <= n2) && (n1 <= n3)) {
            if (n2 <= n3) {
                System.out.print("Küçükten büyüğe: " + n1 + ", " + n2 + ", " + n3);

            } else {
                System.out.print("Küçükten büyüğe: " + n1 + ", " + n3 + ", " + n2);
            }
        } else if ((n2 <= n1) && (n2 <= n3)) {
            if (n1 <= n3) {
                System.out.print("Küçükten büyüğe: " + n2 + ", " + n1 + ", " + n3);
            } else {
                System.out.print("Küçükten büyüğe: " + n2 + ", " + n3 + ", " + n1);
            }
        } else {
            if (n1 <= n2) {
                System.out.print("Küçükten büyüğe: " + n3 + ", " + n1 + ", " + n2);
            } else {
                System.out.print("Küçükten büyüğe: " + n3 + ", " + n2 + ", " + n1);
            }
        }
    }
}
