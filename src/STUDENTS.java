
class Student extends USERS {
    private String program;
    private String course;

    public Student(String name, int age, String email, String gender, String program, String course) {
        super(name, age, email, gender);
        this.program = program;
        this.course = course;
    }

    public void displayStudentInfo() {
        super.displayInfo();
        System.out.println("Program: " + program);
        System.out.println("Course: " + course);
    }
}
