import java.util.Scanner;

public class SOMA {
    public static void main( String[] args){
        //class
        Program p = new Program("Machine Learning", "CSE07102", "Mwinuka");
        Student s1 = new Student("Prisca", "230343478230","Female");
        Student s2 = new Student("Derrick", "240343431617","Male");
        //object
//    s1.DisplayStudentInfo();
//    p.DisplayProgram();
//    s2.DisplayStudentInfo();

        // logic statement
        System.out.println("Program: ");
        p.DisplayProgram();
        System.out.println("\nStudent one:");
        s1.DisplayStudent();
        System.out.println("\nStudent two: ");
        s2.DisplayStudent();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the student name to check their course: ");
        String inputName= scanner.nextLine().trim().toLowerCase();

        if(s1.sName != null && inputName.equals(s1.sName.toLowerCase())){
            System.out.println("Course for "+s1.sName+":"+s1.sCourse);
        }else if (s2.sName != null && inputName.equals(s2.sName.toLowerCase())){
            System.out.println("Course for "+s2.sName+":"+s2.sCourse);
        }else{
            System.out.println("Student not found.");
        }
scanner.close();

    }

}
