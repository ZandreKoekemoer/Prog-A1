/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prja1q2.Soldier;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
import org.junit.jupiter.api.Test;

public class SoldierTest 
{

    @Test
    public void testTakeDamage()
    {
        Soldier soldier = new Soldier("Test Soldier", 100, "Assault");
        soldier.takeDamage(30);
        assertEquals(70, soldier.getHealth());
    }

    @Test
    public void testAttack() 
    {
        Soldier attacker = new Soldier("Attacker", 100, "Assault");
        Soldier target = new Soldier("Target", 100, "Sniper");
        attacker.attack(target);
        assertTrue(target.getHealth() < 100);
    }
}
