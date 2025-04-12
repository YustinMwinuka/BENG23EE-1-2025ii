public class PROGRAM {
    String Name;
    String Code;
    String Lecture;

    // constructor
    PROGRAM (String pName, String pCode, String pLecture){

        Name =  pName;
        Code = pCode;
        Lecture = pLecture;

    }

    void DisplayProgram(){
        System.out.println("Name: " +Name);
        System.out.println("Code:  "+ Code);
        System.out.println("Lecture: "+ Lecture);
    }

}
