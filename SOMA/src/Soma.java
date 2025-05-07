public  class Soma{
//    abstract Void Display();
    public static void main(String[] args) {
        Students Student = new Students ("Anna", 20, "anna@gmail.com", "Female", "BEE", "BENG23EE");
        Instructors Instructor = new Instructors("Dr. Kenny", 45, "Kenny@gmail.com", "Male", "Lecturer", "PhD");
        Admin admin = new Admin("Mr. John", 35, "john@gmail.com", "Male", "System Admin");

        System.out.println("\nStudent Info");
        Student.displayInfo();

        System.out.println("\nInstructor Info");
        Instructor.displayInfo();

        System.out.println("\nAdmin Info");
        admin.displayInfo();
    }
}

