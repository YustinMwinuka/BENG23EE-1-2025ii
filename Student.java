public class Student {

    String Name;
    String RegNo;
    String Gender;

    Student(String sname, String sregNo, String sgender) {
        Name = sname;
        RegNo = sregNo;
        Gender = sgender;
    }

    void DisplayStudent() {
        System.out.println("Student Name:" + Name);
        System.out.println("student RegNo:" + RegNo);
        System.out.println("Student Gender:" + Gender);
    }
}


