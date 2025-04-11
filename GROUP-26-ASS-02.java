
// Program class
class Program {
    String name;
    String code;

    // Constructor
    Program(String pname, String pcode) {
        name = pname;
        code = pcode;
    }

    // Method to display program details
    void display() {
        System.out.println("Program Name: " + name);
        System.out.println("Program Code: " + code);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of Program
        Program p1 = new Program("Computer Science", "CS101");

        // Displaying program details
        p1.display();
    }
}
