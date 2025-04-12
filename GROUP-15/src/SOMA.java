import java.util.Scanner;

import java.util.Scanner;

public class SOMA {
    public static void main( String[] args){
        //class
        PROGRAM p = new PROGRAM("Machine Learning", "CSE07102", "Mwinuka");
        STUDENT s1 = new STUDENT("Michael", "Machine Learning","Danford",230343404259L,'M',24);
        STUDENT s2 = new STUDENT("Martha", "Electrical","Runguya",230345487532L,'F',21);
        Scanner scan =new Scanner(System.in);
        //object

        s1.DisplayStudentInfo();
        p.DisplayProgram();
        s2.DisplayStudentInfo();

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
        }else
            System.out.println("You don't enroll");
        }

    }

}


