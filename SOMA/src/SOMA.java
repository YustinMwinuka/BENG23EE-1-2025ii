import java.util.Scanner;

public class SOMA {
    public static void main(String[] args) {
        String Name;
        Program p1 = new Program("OOP", "MWINUKA", 567);
        Student s1 = new Student("ELIKANA", "MALE", 456);
        Student s2 = new Student( "ANNA", "FEMALE", 654321);
        System.out.println("student 1 information");
        s1.DisplayStudent();
        System.out.println("Subject information ");
        p1.DisplayProgram();
        System.out.println(" ");
        s2.DisplayStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter name");
        Name = sc.nextLine();
        if (Name.equalsIgnoreCase(s1.Name)) {
            System.out.println("Machine Language");
        } else if (Name.equalsIgnoreCase(s2.Name)) {
            System.out.println("BENGCOE");
        } else {
            System.out.println("none of option");

        }
    }

    }

