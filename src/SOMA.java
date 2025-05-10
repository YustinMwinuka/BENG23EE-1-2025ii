
// Main Class: SOMA
public abstract class SOMA {
    abstract void display();
    public static void main(String[] args) {

        Student student = new Student("Tfyner", 20, "theresiagervas50@gmail.com", "Female", "BEE", "BENG23EE");
        Instructor instructor = new Instructor("Dr.yustin", 45, "yustinmwinuka53@gmail.com", "Male", "Professor", "PhD in AI");
        Admin admin = new Admin("Charlie", 35, "charlieskhafidh23@gmail.com", "Male", "System Administrator");

        System.out.println("=== Student Info ===");
        student.displayStudentInfo();

        System.out.println("\n=== Instructor Info ===");
        instructor.displayInstructorInfo();

        System.out.println("\n=== Admin Info ===");
        admin.displayAdminInfo();


    }
}
