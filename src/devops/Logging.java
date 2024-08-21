package devops;



import java.util.Scanner;



public class Logging {



    

    private static final String USERNAME = "admin";

    private static final String PASSWORD = "password123";



    public static void main(String[] args) {

        

        Scanner scanner = new Scanner(System.in);



       

        System.out.print("Enter username: ");

        String inputUsername = scanner.nextLine();



        

        System.out.print("Enter password: ");

        String inputPassword = scanner.nextLine();



        

        if (USERNAME.equals(inputUsername) && PASSWORD.equals(inputPassword))

        {

            System.out.println("Sign-in successful!");

        } 

        else 

        {

            System.out.println("Invalid username or password.");

        }



        scanner.close();

    }

}