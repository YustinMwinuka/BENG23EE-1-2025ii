import java.util.Scanner;

public class SOMA {
            public static void main(String[] args) {
                Program P = new Program("OBJECT ORIENTED PROGRAMMING", "CSEU 07205", "YUSTIN MWINUKA");


                Students S1 = new Students("EZRA", "BENG23EE-1", "Male");
                Students S2 = new Students("FATMA", "OD22CE", "Female");
                System.out.println("Program:");
                P.displayProgram();
                System.out.println("\n      Student One");
                S1.displayStudents();
                System.out.println("\n      Student Two");
                S2.displayStudents();
                Scanner sc = new Scanner(System.in);HH
                System.out.print("\nEnter student name to check: ");
                String inputName = sc.nextLine();
                if (inputName.equalsIgnoreCase("EZRA")) {
                    System.out.println("\n     Student Found");
                    S1.displayStudents();
                    System.out.println("\n     Program Information");
                    P.displayProgram();
                    System.out.println("\nHe is involved in Machine Learning.");
                } else if (inputName.equalsIgnoreCase("FATMA")) {
                    System.out.println("\n     Student Found");
                    S2.displayStudents();
                    System.out.println("\n     Program Information");
                    P.displayProgram();
                    System.out.println("\nHe is not involved in Machine Learning.");
                } else {
                    System.out.println("\nStudent not found.");
                }
                sc.close();
            }
        }