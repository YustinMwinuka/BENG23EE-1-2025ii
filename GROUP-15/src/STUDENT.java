public class STUDENT{

    String Fname, Sname;
    long RegNumber;
    String course;
    char gender;
    int age;


    // constructor
    STUDENT(String sFname, String sCourse,String Ssurname,long sRegNumber, char sgender, int AGE){

        Fname= sFname;
        Sname=Ssurname;
        RegNumber=sRegNumber;
        gender=sgender;
        age= AGE;
        course= sCourse;

    }

    void DisplayStudentInfo(){
        System.out.println("Name: " +Fname+" "+Sname);
        System.out.println("Registration Number :  "+ RegNumber);
        System.out.println("Gender: "+ gender);
        System.out.println("Course: "+course);
        System.out.println("Age: "+age);
    }

}



