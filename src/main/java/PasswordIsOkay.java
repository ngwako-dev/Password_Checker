public class PasswordIsOkay{


    public static boolean passwordIsOkay(){
        boolean result =false;
        if(PasswordIsValid.counter >= 3){
            result = true;
        }
        return result;
    }
}
