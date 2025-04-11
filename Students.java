public class Students {
    String name;
    String Course;
    String gender;

    Students(String sname, String scourse, String sgender) {
        this.name = sname;
        this.Course = scourse;
        this.gender = sgender;
    }


    void displayStudents() {
        System.out.println("Students name is:" + name);
        System.out.println("Students Course:" + Course);
        System.out.println("Students gender is:" + gender);
    }
}
