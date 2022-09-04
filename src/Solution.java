import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of entries

        for (int i=0;i<t;i++)
        {
            try
            {
                long x = scanner.nextLong();
                System.out.println(x+" can be fitted in:");
                if ((x >= Byte.MIN_VALUE) && (x <= Byte.MAX_VALUE)){
                    System.out.println("* byte");
                } if (x>= Short.MIN_VALUE && x<=Short.MAX_VALUE) {
                    System.out.println("* short");
                } if (x>= Integer.MIN_VALUE && x<=Integer.MAX_VALUE) {
                    System.out.println("* int");

                } if (x>= Long.MIN_VALUE && x<= Long.MAX_VALUE){
                    System.out.println("* long");
                }


            }   catch (Exception e){
                    System.out.println(scanner.next()+ " can't be fitted anywhere.");
                }
        }
    }
}




//import java.util.*;
//        import java.io.*;
//
//class Solution{
//    public static void main(String []argh){
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++){
//            try{
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in:");
//                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
//                    System.out.println("* byte");
//                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
//                    System.out.println("* short");
//                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
//                    System.out.println("* int");
//                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
//                    System.out.println("* long");
//            }
//            catch(Exception e){
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }
//    }
//}


/*

int sum = 0;
for(int i=0, int j=0; i<5 || j<5; ++i, j=i+1) {
sum +=i;
}
print sum



i   1 2 3 4 4
j   2 3 4 5 5
sum 1 3 6 10 12
 */