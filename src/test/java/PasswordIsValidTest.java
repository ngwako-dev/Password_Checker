import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordIsValidTest {

    @Test
    void passwordIsValid() {

          assertEquals("Your passwords should have an uppercase.\n" +
                      "Your password should have a lowercase.\n" +
                      "Your password should have a number.\n" +
                      "Your password should have special character.\n" +
                      "Your should be longer than 8.\n" +
                      "Your password should exist.\n" +
                      "Password is never okay.", PasswordIsValid.passwordIsValid(""));

          assertEquals("Your password should have a lowercase.\n" +
                       "Your password should have a number.\n" +
                       "Your password should have special character.\n" +
                       "Your should be longer than 8.\n" +
                       "Password is never okay.", PasswordIsValid.passwordIsValid("T"));

          assertEquals("Your password should have a number.\n" +
                      "Your password should have special character.\n" +
                      "Your should be longer than 8.\n" +
                      "Password is never okay.", PasswordIsValid.passwordIsValid("Tr"));

          assertEquals("Your password should have special character.\n" +
                       "Your should be longer than 8.\n" +
                       "Password is never okay.", PasswordIsValid.passwordIsValid("Tr3"));

          assertEquals("Your should be longer than 8.\n" +
                     "Password is never okay.", PasswordIsValid.passwordIsValid("Tr3@"));

        assertEquals("", PasswordIsValid.passwordIsValid("Tr3@78787"));
      }


        @Test
        void passwordIsOkay () {
            assertTrue(PasswordIsValid.passwordIsOkay("Sbu@78DY66"));
            assertFalse(PasswordIsValid.passwordIsOkay(""));
        }
    }

