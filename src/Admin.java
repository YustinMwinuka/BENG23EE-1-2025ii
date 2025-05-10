
// Subclass: Admin
class Admin extends USERS {
    private String role;

    public Admin(String name, int age, String email, String gender, String role) {
        super(name, age, email, gender);
        this.role = role;
    }

    public void displayAdminInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
    }
}