public class Student {
    String Name;
    String course;
    String Gender;

    Student(String sName, String scourse, String sGender ){
        Name=sName;
        course=scourse;
        Gender= sGender;


}
       void DisplayStudent() {
           System.out.println("Name" + Name);
           System.out.println("course" + course);
           System.out.println("Gender" + Gender);
       }
}
