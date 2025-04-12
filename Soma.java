
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("***********WELCOME AGAIN TO OUR SYSTEM*************\n");
//      Objects for student class

        Student s1 = new Student("MARIA", "female", 20030, "ELECTRICAL ENGINEEERING");
        Student s2 = new Student("JOHN", "male", 2003, "COMPUTER ENGINEEERING");
        Student s3 = new Student("MAIMUNA", "female", 20039, "CIVIL ENGINEEERING");
        Student s4 = new Student("ALLY", "male", 20459, "MECHANICAL  ENGINEEERING");

        Program p1 = new Program("comouter", "Dr.Tzzy", 42535);


        System.out.println("**************student 1 ***************");
        s1.displayStudentInfo();
        System.out.println("*************student 2**********\n");
        s2.displayStudentInfo();
        System.out.println("***************Student 3********\n");
        s3.displayStudentInfo();

        System.out.println("***********student 4***************\n");
        s4.displayStudentInfo();


        System.out.println("Search for name of student to know the course he or she is belonging\n");
        String student = scan.nextLine();

        switch(student.toUpperCase()){
            case "MARIA":
                System.out.println(s1.name + " belong to " + s1.department);
                break;
            case "JOHN":
                System.out.println(s2.name + " belong to " + s2.department);
                break;
            case "MAIMUNA":
                System.out.println(s3.name + " belong to " + s3.department);
                break;
            case "ALLY":
                System.out.println(s4.name + " is belong to " + s4.department);
                break;
            default:
                System.out.println("name is not exist, only above four names are available in our system");
        }


//        if (student!= s1.name || student!= s2.name || student!= s3.name || student != s4.name) {
//            System.out.println("the name is not exist, only above four names are admitted to our system");
//        } else {
//            if (student == s1.name) {
//                System.out.println(s1.department);
//            }
//            if (student == s2.name) {
//                System.out.println(s2.department);
//            }
//            if (student== s3.name) {
//                System.out.println(s3.department);
//            }
//            if (student== s4.name) {
//                System.out.println(s4.department);
//            }
//
//
//        }

    }
}