/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proga1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
class Student 
{
    int id;
    String name;
    int age;
    String email;
    String course;

    // List to hold all students that have entered in first option
    private static List<Student> students = new ArrayList<>();
    public Student(int id, String name, int age, String email, String course)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Static method to save a new student
    public static void saveStudent(Scanner input) 
    {
        System.out.println("CAPTURE A NEW STUDENT");

        System.out.print("Enter the student ID: ");
        int studentID = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter the student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter student age: ");
        int studentAge = input.nextInt();
        input.nextLine(); 

        
        while (studentAge < 16) 
        {
            System.out.println("You have entered a incorrect student age!!!.");
            System.out.print("Please re-enter the student age >> ");
            studentAge = input.nextInt();
            input.nextLine();
        }

        System.out.print("Enter the student email: ");
        String studentEmail = input.nextLine();

        System.out.print("Enter the student course: ");
        String studentCourse = input.nextLine();

        Student newStudent = new Student(studentID, studentName, studentAge, studentEmail, studentCourse);
        students.add(newStudent);

        System.out.println("Student captured successfully!");
    }

    public static void searchStudent(Scanner input)
    {
        System.out.print("Enter the student ID to search: ");
        int studentID = input.nextInt();
        input.nextLine();

        
        for (Student student : students)
        {
            if (student.id == studentID)
            {
                System.out.println("Student Details:");
                System.out.println("ID: " + student.id);
                System.out.println("Name: " + student.name);
                System.out.println("Age: " + student.age);
                System.out.println("Email: " + student.email);
                System.out.println("Course: " + student.course);
                return;  // Exit the method after finding and displaying the student
            }
        }
        System.out.println("Student with ID: " + studentID + " was not found.");
    }

    public static void deleteStudent(Scanner input)
    {
        System.out.print("Enter the student ID to delete: ");
        int studentID = input.nextInt();
        input.nextLine();

        // Search for the student and remove it from the list
        for (Student student : students) {
            if (student.id == studentID) {
                students.remove(student);
                System.out.println("Student with ID: " + studentID + " deleted successfully.");
                return;  // Exit the method after deleting the student
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
    }

    
     public static void studentReport() 
     {
        //Reference Empty
        
        // According to codecademy(2023)the .isEmpty() method returns true if a string has no content. It returns false if the string has content.
        /*
        codecademy(2023)
        I used this method to determine if there is soldiers or not
        */
        if (students.isEmpty()) 
        {
            System.out.println("No students available.");
        } else 
        {
            System.out.println("Student Report:");
            for (Student student : students) 
            {
                System.out.println("STUDENT REPORT");
                System.out.println("***********************************");
                System.out.println("ID: " + student.id + ", Name: " + student.name + ", Email: " + student.email + ", Course: " + student.course);
            }
        }
     }
    // Static method to exit the application
    public static void exitStudentApplication() 
    {
        System.out.println("Exiting application...");
    }
}