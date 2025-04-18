
import java.util.Scanner;
public class SOMA {
 public static void main(String[] args) {
     Program P = new Program("OOP", "SCETO07255", "Mwinuka");

     Student S1 = new Student("Sam", "Male", "BENG23EE");
     Student S2 = new Student("Mery", "Female", "OD23RET");
     System.out.println("Program:");
     P.displayProgram();
     System.out.print("\nStudent One:");
     S1.displayStudent();
     System.out.println("\nStudent Two:");
     S2.displayStudent();

     Scanner sc = new Scanner(System.in);
     System.out.print("\nEnter student name to check:");
     String inputName = sc.nextLine();

     if (inputName.equalsIgnoreCase("Sam")) {
         System.out.println ("\nStudent Found:");
         S1.displayStudent();
         System.out.println("\nProgram Info:");
         P.displayProgram();
         System.out.println("\nHe is involved in Machine Leaning.");
     } else if (inputName.equalsIgnoreCase("Mery")) {
         System.out.println("\nstudent Found:");
         S2.displayStudent();
         System.out.println("\nProgram info:");
         P.displayProgram();
         System.out.println("\nHe is not involved in Machine Learning.");
     } else {
         System.out.println("\nstudent not found.");
     }
     sc.close();
 }
     }
