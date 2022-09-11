package src;

public class IsPrime {
    public static void main(String[] args) {
        int numberOfDividers = 0;

        for (int i = 2; i <= 100; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numberOfDividers++;
                }
            }
            if (numberOfDividers == 2) {
                System.out.print(i + " ");

            }
            numberOfDividers = 0;
        }

    }
}
