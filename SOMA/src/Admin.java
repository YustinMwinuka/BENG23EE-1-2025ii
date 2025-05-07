public class Admin extends Users{
    private String Role;

    public Admin(String Name, int Age, String Email, String Gender, String cRole) {
        super(Name, Age, Email, Gender);
        Role = cRole;
    }

    @Override
    void Display() {

    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + Role);
    }
}
