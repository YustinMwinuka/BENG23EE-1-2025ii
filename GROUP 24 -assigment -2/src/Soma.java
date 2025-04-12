import java.util.Scanner;

public class Soma {
    public static void main( String[] args){
    //class
    Program p = new Program("Machine Learning", "CSE07102", "Mwinuka");
    Students s1 = new Students("Justice", "Machine Learning","Kamala",230345458277L,'M',20);
    Students s2 = new Students("Zaina", "Mechanical","Hasan",2303454542765L,'F',20);
        Scanner scan =new Scanner(System.in);
    //object
//    s1.DisplayStudentInfo();
//    p.DisplayProgram();
//    s2.DisplayStudentInfo();

   // logic statement
        System.out.println("Enter your Name");
        String StudentCourse;
        StudentCourse = scan.nextLine();

        if(StudentCourse.equals(s1.Fname)){
            s1.DisplayStudentInfo();
            System.out.println("You  study "+p.Name);
        }else if (StudentCourse.equals(s2.Fname)){
            s2.DisplayStudentInfo();
            System.out.println("You don't study "+p.Name);
        }else{
            System.out.println("You don't enroll");
        }

    }

}
