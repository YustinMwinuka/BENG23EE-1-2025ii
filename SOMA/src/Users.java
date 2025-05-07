public abstract class Users {
    abstract void Display ();
    String Name;
    int Age;
    String Email;
    String Gender;
public Users (String cName, int cAge, String cEmail, String cGender){
    Name = cName;
    Age = cAge;
    Email = cEmail;
    Gender=cGender;

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
