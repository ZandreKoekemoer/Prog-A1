/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proga1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProgA1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        // Reference Exit
        //According to stackoverflow the boolean exit can be used to exit a loop
        
        /*stackoverflow(2014)
        I used this refernce to find a better way to exit the loop to end the program
        */
        boolean exit = false;

        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("**************************************");
        System.out.println("Enter (1) to open menu or press any other key to exit");

        int option = input.nextInt();
        input.nextLine();

        while (option == 1 && !exit) 
        {
            System.out.println("Please select one of the options:");
            System.out.println("1) Capture a new Student");
            System.out.println("2) Search for a student");
            System.out.println("3) Delete a student");
            System.out.println("4) Print student report");
            System.out.println("5) Exit application");

            int selectOption = input.nextInt();
            input.nextLine(); // Consume the newline character
            
            // Reference Methods
            
            //According to stackoverflow(2013) you can call the method within the if-else statement to shorten the main program
                
            /*StackOverlFlow(2013)
            I used this reference because i was unsure how to call the method by using an if statement
            */

            // Using if-else statements to handle the menu options
            if (selectOption == 1) 
            {
                Student.saveStudent(input);
            } else if (selectOption == 2)
            {
                Student.searchStudent(input);
            } else if (selectOption == 3) 
            {
                Student.deleteStudent(input);
            } else if (selectOption == 4) 
            {
                Student.studentReport();
            } else if (selectOption == 5) 
            {
                Student.exitStudentApplication();
                exit = true;
            } else 
            {
                System.out.println("Invalid option. Please try again.");
            }

            if (!exit) 
            {
                System.out.println("Enter (1) to open menu or press any other key to exit");
                if (input.hasNextInt()) 
                {
                    
                    option = input.nextInt();//Option given to user again for if he wants to continue or quit
                    input.nextLine(); 
                } else 
                {
                    option = 0; // Exit the loop
                }
            }
        }

        System.out.println("Application closed.");
    }
}
/*Reference

stackoverflow. 2013.Calling a method from within a if/if else statement. (Version 1.0-SNAPSHOT)https://stackoverflow.com/questions/16237001/calling-a-method-from-within-an-if-if-else-statement (Accessed 3 September 2024)
geeksForgeeks. 2023. How to remove given object from an Array in Java?.(Version 1.0-SNAPSHOT)https://www.geeksforgeeks.org/how-to-remove-given-object-from-an-array-in-java/ (Accessed 3 September 2024)
stackoverflow.2014.What is the best way to exit a loop?.(Version 1.0-SNAPSHOT)https://stackoverflow.com/questions/28368919/what-is-the-best-way-to-exit-loop-in-java (Accessed 3 September 2024)
*/