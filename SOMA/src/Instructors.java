public class Instructors extends Users {
    private String Position;
    private String Qualification;

    public Instructors (String Name, int Age, String Email, String Gender, String cPosition, String cQualification) {
        super(Name, Age, Email, Gender);
        Position = cPosition;
        Qualification = cQualification;
    }

    @Override
    void Display() {
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + Position);
        System.out.println("Qualification: " + Qualification);
    }
}

