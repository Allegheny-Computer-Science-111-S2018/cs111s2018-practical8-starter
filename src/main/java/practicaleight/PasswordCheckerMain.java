package practicaleight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
 * The PasswordCheckerMain will construct and use the PasswordChecker.
 **/

public class PasswordCheckerMain {

  /**
   * Construct and use an instance of the PasswordChecker.
   **/
  public static void main(String[] args) {

    // Step One: Declare the starting file and scanner
    File passwordInputFile = null;
    Scanner scanner = null;

    // Step Two: Connect the scanner to the input file
    try {
      passwordInputFile = new File("inputs/password_input.txt");
      scanner = new Scanner(passwordInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the file.");
    }

    // Step Three: Display a welcome message
    System.out.println("Janyl Jumadinova " + new Date());
    System.out.println();

    // Step Four: Read in the password from the file

    // Step Five: Construct an instance of the PasswordChecker class

    // Step Six: Call a method to see if it is a valid password and produce output

    // Step Seven: Display the closing message

  }

}
