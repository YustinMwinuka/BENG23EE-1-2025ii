import java.util.Scanner;

public class SomaDit {


        public static void main(String[] args) {

            DITprogram p = new DITprogram("Machine Learning", "CSE07102", "Mwinuka");
            StudentDIT s1 = new StudentDIT("Justice", "BENG23EE", "John", 230358495895L, 'M');
            StudentDIT s2 = new StudentDIT("Zaina", "BENG23COE", "Juma", 23087959400393L, 'F');
            Scanner scan = new Scanner(System.in);


            p.DisplayProgram();
            s1.DisplayStudent();
            s2.DisplayStudent();


            System.out.println("Enter your Name");
            String StudentCourse;
            StudentCourse = scan.nextLine();

            if (StudentCourse.equals(s1.Fname)) {
                s1.DisplayStudent();
                System.out.println("You  study " + p.Name);
            } else if (StudentCourse.equals(s2.Fname)) {
                s2.DisplayStudent();
                System.out.println("You don't study " + p.Name);
            } else {
                System.out.println("You don't enroll");
            }

        }

    }

