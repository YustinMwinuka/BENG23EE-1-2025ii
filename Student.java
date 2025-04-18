public class Student {
    String Name;
    String Gender;
    String Course;

    Student(String Name, String Gender, String Course) {
        this.Name = Name;
        this.Gender = Gender;
        this.Course = Course;

}
void displayStudent() {
    System.out.println("Student Name:" + Name);
    System.out.println("Student Gender:" + Gender);
    System.out.println("Student Course:" + Course);
}
}