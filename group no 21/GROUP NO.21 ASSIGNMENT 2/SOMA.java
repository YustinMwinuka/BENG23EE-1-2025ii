import java.util.Scanner;

public class SOMA {

    public static void main(String[] args) {

        String nName;
        nName = "Machine Learnig";

        PROGRAM p = new PROGRAM(nName, "CSE107205", "Mwinyuka");

        STUDENT s1 = new STUDENT("230343403111", "YUSUPH SALEHE", "BENG23EE-1");
        STUDENT s2 = new STUDENT("230343404449", "RAHIMU MBERA", "BENG23EE-2");

        System.out.println("Program:");
        p.Displayprogram();
        System.out.println(" Student One");
        s1.Displaystudent();
        System.out.println("Student Two");
        s2.Displaystudent();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name to check their course:");
        String inputName = scanner.nextLine().trim().toLowerCase();
        
        if
        (inputName.equals(s1.sName.toLowerCase())) {

            System.out.println("Course for" + s1.sName + ": " + s1.Class);
        } else if (inputName.equals(s2.sName.toLowerCase())) {
            System.out.println("Course for" + s2.sName + ": " + s2.sClass);
        }else {
            System.out.println("Student not found.");
            
        }
scanner.close();
    }
    }
