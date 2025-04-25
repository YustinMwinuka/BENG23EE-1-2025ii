public class Student {
    String Name;
    String Course;
    String  Gender;
    Student(String sname,String scourse,String sgender) {
        Name = sname;
        Course = scourse;
        Gender = sgender;
    }
    void DisplayStudent() {
        System.out.println("Student name" + Name);
        System.out.println("Student course" + Course);
        System.out.println("Student gender" + Gender);
    }
}
