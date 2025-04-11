public class student {
    String Name;
    int Registration;
    int AcademicYear;



    student(String sname, int sregistration, int syear){
       Name=sname;
       Registration=sregistration;
       AcademicYear=syear;
    }
    void DisplayStudent(){
        System.out.println("Name:"+Name);
        System.out.println("Academic year:"+AcademicYear);
        System.out.println("Registraion no:"+Registration);
    }
}
