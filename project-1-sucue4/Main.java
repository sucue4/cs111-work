import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String storedUsername = "Stephen"; 
    String storedPassword = "mypasswordlol"; 
    System.out.print("Enter your username: ");
    String username = input.nextLine();
    System.out.print("Enter your password: ");
    String password = input.nextLine();
    // TODO Your login check goes here

    if (!username.equals(storedUsername) || !password.equals(storedPassword)) {
      System.out.println("Your Credentials are Wrong!");
      input.close();
      return;
    }

    while(true){
      System.out.println("Options:\n[1] Check Password Validity\n[2] Generate Password\n[0] Quit");
      int choice = input.nextInt();
      input.nextLine();

      if(choice == 0){
        break;
      } else if(choice == 1){
        System.out.print("Enter a password to check the validity of it: ");
        String pass = input.nextLine();

        boolean hasUppercase = false; // boolean values to make sure criteria is met and for later use in the if statement
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        String specialSymbols = "!#$%&'()*_-+=/<>\\[]{}:;@"; // string of special symbols to be used to check if user input has any of these

        for (int i = 0; i < pass.length(); i++) { // uses ASCII code for the letters and numbers to check if each condition is met
          char c = pass.charAt(i);
          if (c >='A' && c <= 'Z') {
            hasUppercase = true;
          } else if (c >='a' && c <= 'z') {
            hasLowercase = true;
          } else if (c >='0' && c <= '9') {
            hasNumber = true;
          }

          for (int j = 0; j < specialSymbols.length(); j++){ // for loop to loop thru the specialSymbols string and see if the char c is part of it
            if (c == specialSymbols.charAt(j)){
              hasSpecial = true;
            }
          }
        }

        if (pass.length() >= 8 && hasUppercase && hasLowercase && hasNumber && hasSpecial){
              System.out.println("Your password is extra strong.");
        } else if (pass.length() >= 8 && hasUppercase && hasLowercase && hasNumber) {
              System.out.println("Your password is strong enough.");
        } else { // else as if one of the requirements/boolean values is false, it is not strong enough (besides special symbol)
              System.out.println("Your password is not strong enough!");
        }
        System.out.println();
      
      } else if(choice == 2){

        int length = 0;

        while (length < 8){ // while loop to keep prompting user for length if it is less than 8
          System.out.print("Enter the length of the password: (must be more than 8 characters long): ");
          length = input.nextInt();
          input.nextLine();
        
          if (length < 8){
            System.out.println("Too short! Your password must be at least 8 characters long.");
          }
        } 

        int specialChoice = -1; // I use -1 as a placeholder as 0 or 1 will be yes or no for use of a special symbol
        while (specialChoice != 0 && specialChoice != 1) {
          System.out.print("Do you want to add special symbols for a stronger password? (0 for no / 1 for yes): ");
          specialChoice = input.nextInt();
          input.nextLine();

          if (specialChoice != 0 && specialChoice != 1) {
            System.out.println("Invalid input! Please choose either 0 for No or 1 for Yes.");
          }
        }
        
        boolean useSymbol = (specialChoice == 1); // checks to see if the choice made by user is 1 and this will be true to use special symbols 

        // make some arrays using aasci values of characters
        char [] upperCase = new char[26];
        char [] lowerCase = new char[26];
        char [] numbers = new char[10];
        String specialSymbols = "!#$%&'()*_-+=/<>\\[]{}:;@";
        char [] special = specialSymbols.toCharArray();

        for (int i = 0; i < 26; i++){ // go through each letter of the alphabet (upper and lowercase) and add them to their respective arrays
          upperCase[i] = (char)('A' + i);
          lowerCase[i] = (char)('a'+ i);
        }

        for (int i = 0; i < 10; i++){
          numbers[i] = (char) ('0' + i);
        }
       
        StringBuilder newPassword = new StringBuilder(); // StringBuilder more efficient for this

        for (int i = 0; i < length; i++) { // use another if statement to loop through each position and randomize to put a lower, upper, or number
          int category = (int)(Math.random() * 3);
          if (category == 0) {
              int randUpper = (int)(Math.random() * upperCase.length);
              newPassword.append(upperCase[randUpper]);
          } else if (category == 1) {
              int randLower = (int)(Math.random() * lowerCase.length);
              newPassword.append(lowerCase[randLower]);
           } else {
              int randNumber = (int)(Math.random() * numbers.length);
              newPassword.append(numbers[randNumber]);
            } 
        }

        if (useSymbol) { // this is to guarantee a special symbol if the user says yes, replaces a random character and put in the symbol
          int randSymbol = (int)(Math.random() * special.length);
          int position = (int)(Math.random() * length);
          newPassword.setCharAt(position, special[randSymbol]);
        }

        System.out.println("Your generated password is " + newPassword.toString()); // make it string for printing
        System.out.println();

      } else {
        System.out.println("Invalid Choice. Please pick either 0, 1, or 2.");
        System.out.println();
      }
    }

    input.close();
  }
}
