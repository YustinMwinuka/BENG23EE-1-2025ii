public class Program {

    String Name;
    String Lecture;
    int Code;

    Program(String pName, String pLecture, int pCode) {
        Name = pName;
        Lecture = pLecture;
        Code = pCode;
    }
        void DisplayProgram(){

        System.out.println("Name;"+ Name);
        System.out.println("Lecture;"+ Lecture);
        System.out.println("Course;"+ Code);


    }

}

