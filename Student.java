public class Student {


    String name;
    String gender;
    int idNumber;
    String department;


    Student(String name, String gender, int idNumber, String department){
        this.name = name;
        this.gender=gender;
        this.idNumber=idNumber;
        this.department=department;

    }

    void displayStudentInfo(){


        System.out.println("name:"+ this.name);
        System.out.println("gender:" + this.gender);
        System.out.println("id Number:" + this.idNumber);
        System.out.println("department:" + this.department);
    }
}
