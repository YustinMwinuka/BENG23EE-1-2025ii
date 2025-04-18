import java.util.Scanner;

public class SOMA {
    public static void main(String[] args) {
        // Create a Program
        Program P = new Program("OOP", "SCETO7255", "Mwinuka");

        // Create Students
        Student S1 = new Student("Kenny", "Male", "BENG23EE");
        Student S2 = new Student("Mery", "Female", "OD23ETE");

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

        if (inputName.equals(S1.Name)) {
            System.out.println("\nStudent Found:");
            S1.displayStudent();
            System.out.println("\nHe is involved in Machine Learning.");

        } else if (inputName.equals(S2.Name)) {
            System.out.println("\nStudent Found:");
            S2.displayStudent();
            System.out.println("\nShe is not involved in Machine Learning.");

        } else {
            System.out.println("\nStudent not found.");
        }

    }
}