public class PROGRAM {

    private String courseName;
    private String courseCode;
    private String instructor;

    PROGRAM(String courseName,String courseCode,String instructor){
        this.courseName= courseName;
        this.courseCode= courseCode;
        this.instructor= instructor;

    }
    void DisplayPROGRAM(){
        System.out.println("Program Name =" + courseName);
        System.out.println("Program Code =" + courseCode);
        System.out.println("Program Instructor"+ instructor);

    }

    public void Displayprogram() {
        
    }
}
