public abstract class Soma{
    abstract void Display();
    public static void main(String[] args) {
        Students student = new Students ("Haji Mengi", 26, "hajisalumu421@gmail.com", "male", "BEE", "BENG23EE");
        Instructors instructor = new Instructors("Dr. Tfyner Gervas", 45, "theresiah@gmail.com", "Female", "Lecturer", "PhD");
        Admin admin = new Admin("Mr. Ezra Ndyetabura", 35, "ezra001@gmail.com", "Male", "System Admin");

        System.out.println("Student Information");
        student.displayInfo();

        System.out.println("\nInstructor Information");
        instructor.displayInfo();

        System.out.println("\nAdmin Information");
        admin.displayInfo();
    }
}
