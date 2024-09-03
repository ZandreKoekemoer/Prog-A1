/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prja1q2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrjA1Q2 
{

    public static void main(String[] args)
    {
        SquadManager manager = new SquadManager();
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("Call of Duty Squad Manager");
            System.out.println("1. Add Assault Soldier");
            System.out.println("2. Add Sniper");
            System.out.println("3. Simulate Battle");
            System.out.println("4. Print Squad Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();
            
            // Reference Switches
            
            //According to w3schools(2023)the switch statement selects one of many code blocks to be executed
            /*w3schools(2023
            I used this reference to make sure how to use switches instead of if_else statements
            */
            switch (option) 
            {
                case 1:
                    System.out.print("Enter Assault Soldier name: ");
                    String assaultName = scanner.nextLine();
                    manager.addSoldier(new Soldier(assaultName, 100, "Assault"));
                    break;
                case 2:
                    System.out.print("Enter Sniper name: ");
                    String sniperName = scanner.nextLine();
                    manager.addSoldier(new Soldier(sniperName, 80, "Sniper"));
                    break;
                case 3:
                    manager.simulateBattle();
                    break;
                case 4:
                    manager.printSquadReport();
                    break;
                case 5:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
/*
codecademy. 2023..isEmpty().(Version 1.0-SNAPSHOT)https://www.codecademy.com/resources/docs/java/strings/isEmpty (Accessed 3 September 2024)
w3schools. 2023. Java Switch.(Version 1.0-SNAPSHOT)https://www.w3schools.com/java/java_switch.asp (Accessed 3 September 2024)
geeksforgeeks. 2024.ArrayList in Java.(Version 1.0-SNAPSHOT)https://www.geeksforgeeks.org/arraylist-in-java/ (Accessed 3 September 2024)
*/

