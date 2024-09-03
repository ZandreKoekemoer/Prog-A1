/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prja1q2;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Random;

public class SquadManager {
    //Reference ArrayLists
    //According to geeksforgeeks(2024) this can be understood as a simple declaration and initialization of a private list.
    /*
    geeksforgeeks(2024)
    used this reference to understand why i need this statment for my code to work
    */
    private ArrayList<Soldier> squad = new ArrayList<>();
    private Random random = new Random();

    public void addSoldier(Soldier soldier) 
    {
        squad.add(soldier);
    }

    public void simulateBattle() 
    {
        if (squad.size() < 2) 
        {
            System.out.println("Not enough soldiers to start a battle.");
            return;
        }

        Soldier soldier1 = squad.get(random.nextInt(squad.size()));
        Soldier soldier2 = squad.get(random.nextInt(squad.size()));

        if (soldier1 == soldier2)
        {
            System.out.println("Battle cannot occur between the same soldier.");
            return;
        }

        soldier1.attack(soldier2);
        System.out.println(soldier2.getName() + " now has " + soldier2.getHealth() + " health.");

        if (soldier2.getHealth() <= 0) 
        {
            System.out.println(soldier2.getName() + " has been defeated.");
            squad.remove(soldier2);
        }
    }

    public void printSquadReport()
    {
        //Reference Empty
        
        // According to codecademy(2023)the .isEmpty() method returns true if a string has no content. It returns false if the string has content.
        /*
        codecademy(2023)
        I used this method to determine if there is soldiers or not
        */
        
        if (squad.isEmpty())
        {
            System.out.println("No soldiers in the squad.");
            return;
        }

        for (Soldier soldier : squad)
        {
            System.out.println(soldier);
        }
    }
}
