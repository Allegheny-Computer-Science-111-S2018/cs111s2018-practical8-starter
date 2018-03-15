package practicaleight;

public class PasswordChecker {

  /**
   * The password to be checked for the PasswordChecker class.
   **/
  private String password;

  /**
   * The desired length of the password to be checked.
   **/
  private static int PASSWORD_MINIMUM_LENGTH = 10;

  /**
   * The constructor for the PasswordChecker.
   **/
  public PasswordChecker(String startingPassword) {
    password = startingPassword;
  }

  public boolean isValidPassword() {
    // TO DO: use these boolean variables when conducting the 3 checks
    boolean isValidLength = false;
    boolean isValidCapitalized = false;
    boolean isValidNumber = false;

    return false;
  }

}
