public class Students extends Users {
    private String Program;
    private String Course;

    public Students(String Name, int Age, String Email, String Gender, String cProgram, String cCourse) {
        super(Name, Age, Email, Gender);
        Program = cProgram;
        Course = cCourse;
    }

    @Override
    void Display() {

    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Program: " + Program);
        System.out.println("Course: " + Course);
    }
}