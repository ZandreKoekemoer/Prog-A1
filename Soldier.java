/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prja1q2;

/**
 *
 * @author User
 */
public class Soldier 
{
    private String name;
    private int health;
    private String role;

    public Soldier(String name, int health, String role)
    {
        this.name = name;
        this.health = health;
        this.role = role;
    }

    public String getName() 
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public void takeDamage(int damage) 
    {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public String getRole() 
    {
        return role;
    }

    public void attack(Soldier target) 
    {
        int damage = "Sniper".equals(this.role) ? 30 : 20;
        System.out.println(this.name + " (" + this.role + ") attacks " + target.name + " for " + damage + " damage!");
        target.takeDamage(damage);
    }

    @Override
    public String toString() 
    {
        return name + " (" + role + ") - Health: " + health;
    }
}
