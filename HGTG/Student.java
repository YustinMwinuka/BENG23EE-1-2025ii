public class Student {
    public String sName;
    public String sCourse;
    String Name;
    String RegNo;
    String Gender;

    Student(String sName, String sRegNo,String sGender) {
        Name = sName;
        RegNo = sRegNo;
        Gender = sGender;
    }
    void DisplayStudent(){
        System.out.println("Student name: "+Name);
        System.out.println("Student RegNo: "+RegNo);
        System.out.println("Student Gender: "+Gender);

    }
}
