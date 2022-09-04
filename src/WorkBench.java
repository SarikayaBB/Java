import java.util.Scanner;

public class WorkBench {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i<=10){
            i++;
            if (i % 2 != 0){
                continue;
            }


            System.out.println(i);

        }


    }
}
