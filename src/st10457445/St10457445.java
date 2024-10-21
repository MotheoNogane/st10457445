/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10457445;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab Testing testing 22222222
 */
public class St10457445 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
             String Username,Password,Lastname,Firstname;
             
             while(true)
        {
            //the user should enter their username
        System.out.println("Enter your username:");
        Username = scanner.nextLine();
        
        //checking the username
        if(Username.contains("_") && Username.length() <=5)
        {
            System.out.println("Username successfully captured"); 
         break;  
        }
        else
        {
            System.out.println("Username is not formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");    
        }
        }
        
    {
        
      while (true)
        {
            //the user should enter their password
            System.out.print("Enter your password: ");
            Password = scanner.nextLine();
            //checking the password
            if (isValidPassword(Password))
            {
            System.out.println("Password successfully captured");
            break;
            }
        else
            {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
            
            }
        }

         
        
        
    }
    //user enters their first name
        System.out.println("Enter yout first name:");
        Firstname = scanner.nextLine();
        //user enters their last name
        System.out.println("Enter yout last name:");
        Lastname = scanner.nextLine();
        
        if (!Username.isEmpty() && !Password.isEmpty() && !Firstname.isEmpty() && !Lastname.isEmpty())
        {
            System.out.println("Welcome \n" + Firstname + "\n" + Lastname+ "!");
            System.out.println("It is great to see you ");
            System.out.println("User successfully registered");
            
            System.out.println("To login please enter your first name ");
            Firstname= scanner.nextLine();
            
            System.out.println("Enter your last name");
            Lastname = scanner.nextLine();
            System.out.println("A successful login");
            
        }
        else
        {
            System.out.println("A failed login");
        }
        
    }
   public static boolean isValidPassword(String password) 
    {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit;
    }
    }
    

