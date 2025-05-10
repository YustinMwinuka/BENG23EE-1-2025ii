public class Instructors extends Users {
    private String Name;
    private int Age;
    private String Email;
    private String Gender;
    private String Position;
    private String Qualification;

    public Instructors (String Name, int Age, String Email, String Gender, String Position, String Qualification) {
        super(Name, Age, Email, Gender);
        this.Name = Name;
        this.Age = Integer.parseInt(String.valueOf(Age));
        this.Email = Email;
        this.Gender = Gender;
        this.Position = Position;
        this.Qualification = Qualification;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Email: " + Email);
        System.out.println("Gender: " + Gender);
        System.out.println("Position: " + Position);
        System.out.println("Qualification: " + Qualification);
    }
}
