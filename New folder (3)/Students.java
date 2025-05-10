public class Students extends Users {
    private String Name;
    private int Age;
    private String Email;
    private String Gender;
    private String Program;
    private String Course;

    public Students(String Name, int Age, String Email, String Gender, String Program, String Course) {
        super(Name, Age, Gender, Email);
        this.Name = Name;
        this.Age = Integer.parseInt(String.valueOf(Age));
        this.Email = Email;
        this.Gender = Gender;
        this.Program = Program;
        this.Course = Course;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Email: " + Email);
        System.out.println("Gender: " + Gender);
        System.out.println("Program: " + Program);
        System.out.println("Course: " + Course);
    }
}
