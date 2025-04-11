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
                System.out.println("Student name is:" + name);
                System.out.println("Student course is:" + Course);
                System.out.println("Student gender is:" + gender);
            }
        }

