import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner Obj=new Scanner(System.in);

        System.out.println("Please enter your password :");
        String password=Obj.nextLine();

        System.out.println(PasswordIsValid.passwordIsValid(password));
        System.out.println(PasswordIsValid.passwordIsOkay(password));




    }

}