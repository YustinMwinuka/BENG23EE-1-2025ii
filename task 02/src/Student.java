public class Student {
    String fname;
    String gender;
    Program program;

    public Student(String fname, String gender, Program program) {
        this.fname = fname;
        this.gender = gender;
        this.program = program;
    }

    public void displaySubjectOnly() {
        System.out.println(fname + " is studying: " + program.getSubjectName());
    }
}