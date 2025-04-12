public class StudentDIT  {
    String Fname, Sname;
    long RegNumber;
    String course;
    char gender;




    StudentDIT(String sFname, String sCourse,String Ssurname,long sRegNumber, char sgender){

        Fname= sFname;
        Sname=Ssurname;
        RegNumber=sRegNumber;
        gender=sgender;

        course= sCourse;

    }

    void DisplayStudent(){
        System.out.println("Name: " +Fname+" "+Sname);
        System.out.println("Registration Number :  "+ RegNumber);
        System.out.println("Gender: "+ gender);
        System.out.println("Course: "+course);
        System.out.println("\n");

    }

}


