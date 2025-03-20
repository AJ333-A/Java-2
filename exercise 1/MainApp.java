//student information program
//it prompts a user to enter their name and marks, then creates a student object
//Done by Joy Ashley

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt user for name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt user for marks
        System.out.println("Enter your marks: ");
        double marks = scanner.nextDouble();

        // Create a Student object and display details
        Student student = new Student(name, marks);
        student.displayDetails();  

        
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.calculateGrade(marks);  

    
        scanner.close();
    }
}

// Student class 
class Student {
    String name;
    double marks;

    // Constructor to initialize
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method 
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

// GradeCalculator class 
class GradeCalculator {
    // Method 
    public void calculateGrade(double marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid mark.Marks should be between 0 and 100.");
        } else if (marks >= 90) {
            System.out.println("Your grade is A");
        } else if (marks >= 75) {
            System.out.println("Your grade is B");
        } else if (marks >= 50) {
            System.out.println("Your grade is C");
        } else if (marks >= 35) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Invalid input");
        }
            
        
    }
}
