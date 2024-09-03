/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StudentTest
{
    @Test
    void testSaveStudent() 
    {
        // Add a student directly using the constructor
        Student student = new Student(1, "Zandre Koekemoer", 20, "zandrekoekemoer1@gmail.com", "ITTP");
        Student.students.add(student);

        assertEquals(1, Student.students.size());
        Student savedStudent = Student.students.get(0);
        assertEquals(1, savedStudent.id);
        assertEquals("Zandre Koekemoer", savedStudent.name);
        assertEquals(20, savedStudent.age);
        assertEquals("zandrekoekemoer1@gmail.com", savedStudent.email);
        assertEquals("ITTP", savedStudent.course);
    }

    @Test
    void testSearchStudent() 
    {
        // Add a student to the list
        Student student = new Student(1, "Zandre Koekemoer", 20, "zandrekoekemoer1@gmail.com", "ITTP");
        Student.students.add(student);

        
        Student result = Student.searchStudentById(1);

        assertNotNull(result);
        assertEquals(1, result.id);
        assertEquals("John Doe", result.name);
    }

    @Test
    void testSearchStudent_StudentNotFound() 
    {
        // Attempt to search for a non-existent student
        Student result = Student.searchStudentById(999);

        assertNull(result);
    }

    @Test
    void testDeleteStudent() 
    {
        // Add a student to the list
        Student student = new Student(1, "Zandre Koekemoer", 20, "zandrekoekemoer1@gmail.com", "ITTP");
        Student.students.add(student);

        // Delete the student
        Student.deleteStudentById(1);

        assertTrue(Student.students.isEmpty());
    }

    @Test
    void testDeleteStudent_StudentNotFound() 
    {
        
        Student student = new Student(1, "Zandre Koekemoer", 20, "zandrekoekemoer1@gmail.com", "ITTP");
        Student.students.add(student);

        
        Student.deleteStudentById(999);

        assertEquals(1, Student.students.size());
    }

    @Test
    void testStudentAge_StudentAgeValid() 
    {
        Student student = new Student(1, "Zandre Koekemoer", 20, "zandrekoekemoer1@gmail.com", "ITTP");
        assertTrue(student.age >= 16);
    }

    @Test
    void testStudentAge_StudentAgeInvalid() 
    {
        Student student = new Student(1, "Zandre Koekemoer", 10, "zandrekoekemoer1@gmail.com", "ITTP");
        assertFalse(student.age >= 16);
    }
}
