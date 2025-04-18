public class Program {


    String Pname;
    String Plecture;
    int Pcode;


    Program(String Pname, String Plecture, int Pcode){

        this.Pname = Pname;
        this.Plecture=Plecture;
        this.Pcode=Pcode;


    }

    void displayProgramInfo(){

        System.out.println("Welcome to see the program Informaations");

        System.out.println("program name is :  " + this.Pname);
        System.out.println("program lecture is :" + this.Plecture);
        System.out.println("program code is " + this.Pcode);

    }
}
