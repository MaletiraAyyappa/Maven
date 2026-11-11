package com.example.Github;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Gradecaltest{
	@Test
    void testGrade() {
        assertEquals("Grade:A+", Gradecal.Grade(80));
        assertEquals("Grade:A", Gradecal.Grade(75));
    }
	@Test
    void testGrades() {
        assertEquals("Grade:A+", Gradecal.Grade(80));
        assertEquals("Grade:A", Gradecal.Grade(75));
    }
}