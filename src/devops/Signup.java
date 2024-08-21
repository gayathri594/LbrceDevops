package devops;

import java.util.Scanner;

public class Signup {

    private static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        String username;
        String password;
        String confirmPassword;
       
        // Get user details
        System.out.print("Enter username: ");
        username = scanner.nextLine();
       
        System.out.print("Enter password: ");
        password = scanner.nextLine();
       
        System.out.print("Confirm password: ");
        confirmPassword = scanner.nextLine();
       
        // Validate user input
        if (validateUsername(username) && validatePassword(password, confirmPassword)) {
            // Save user data (For demo purposes, we'll just print it)
            System.out.println("Signup successful!");
            System.out.println("Username: " + username);
            // In a real application, you would save these details securely in a database
        } else {
            System.out.println("Signup failed. Please ensure your username and password meet the requirements and match.");
        }
       
        scanner.close();
    }

    private static boolean validateUsername(String username) {
        // Basic validation: username should be non-empty
        return username != null && !username.trim().isEmpty();
    }

    private static boolean validatePassword(String password, String confirmPassword) {
        // Basic validation: passwords must match and meet minimum length requirements
        return password != null && confirmPassword != null &&
               password.equals(confirmPassword) &&
               password.length() >= 6; // Example requirement: password must be at least 6 characters
    }
}