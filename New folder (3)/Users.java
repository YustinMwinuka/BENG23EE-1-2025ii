public abstract class Users {
    String Name;
    int Age;
    String Email;
    String Gender;
    public Users (String Name, int Age, String Email, String Gender){
        this.Name = Name;
        this.Age = Age;
        this.Email = Email;
        this.Gender= Gender;

    }
    <display> display Instructor () {
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
        System.out.println("Email:" + Email);
        System.out.println("Gender:" + Gender);
        return null;
    }

    protected void displayInfo() {
    }
}
