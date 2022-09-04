import java.util.Scanner;

public class PasswordSuccess {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessful = false;
        while(!passwordSuccessful) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessful = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }
    }
}
