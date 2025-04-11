import java.util.Scanner;

class Program {
    String Name;
    String Code;
    String Lecture;

    // Constructor
    Program(String Name, String Code, String Lecture) {
        this.Name = Name;
        this.Code = Code;
        this.Lecture = Lecture;
    }

    // Method defined properly outside the constructor
    void displayProgram() {
        System.out.println("Program Name: " + Name);
        System.out.println("Program Code: " + Code);
        System.out.println("Program Lecture: " + Lecture);
    }
}

class Student {
    String Name;
    String Gender;
    String Course;

    Student(String Name, String Gender, String Course) {
        this.Name = Name;
        this.Gender = Gender;
        this.Course = Course;
    }

    void displayStudent() {
        System.out.println("Student Name: " + Name);
        System.out.println("Student Gender: " + Gender);
        System.out.println("Student Course: " + Course);
    }
}

public class SOMA {
    public static void main(String[] args) {
        // Create a Program
        Program P = new Program("OOP", "SCETO7255", "Mwinuka");

        // Create Students
        Student S1 = new Student("Sam", "Male", "BENG23EE");
        Student S2 = new Student("Mery", "Female", "OD23RET");

        // Display initial info
        System.out.println("Program:");
        P.displayProgram();

        System.out.println("\nStudent One:");
        S1.displayStudent();

        System.out.println("\nStudent Two:");
        S2.displayStudent();

        // Ask user to input a student name
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter student name to check: ");
        String inputName = sc.nextLine();

        if (inputName.equalsIgnoreCase("Sam")) {
            System.out.println("\nStudent Found:");
            S1.displayStudent();
            System.out.println("\nProgram Info:");
            P.displayProgram();
            System.out.println("\nHe is involved in Machine Learning.");
        } else if (inputName.equalsIgnoreCase("Mery")) {
            System.out.println("\nStudent Found:");
            S2.displayStudent();
            System.out.println("\nProgram Info:");
            P.displayProgram();
            System.out.println("\nHe is not involved in Machine Learning.");
        } else {
            System.out.println("\nStudent not found.");
        }

        sc.close();
    }
}