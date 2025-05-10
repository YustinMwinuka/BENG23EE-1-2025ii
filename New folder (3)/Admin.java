public class Admin extends Users{
    private String Name;
    private int Age;
    private String Email;
    private String Gender;
    private String Role;

    public Admin(String Name, int Age, String Email, String Gender, String Role) {
        super(Name, Age, Email, Gender);
        this.Name = Name;
        this.Age = Integer.parseInt(String.valueOf(Age));
        this.Email = Email;
        this.Gender = Gender;
        this.Role = Role;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Email: " + Email);
        System.out.println("Gender: " + Gender);
        System.out.println("Role: " + Role);
    }
}
