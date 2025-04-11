import java.util.Scanner;
class Main {
    static String Name;
    static   String Gender;
    static String Voice;
    public static void main(String[] args){
        male omale=new male();
        female ofemale= new female();
        int choice;
        Scanner sc= new Scanner(System.in);
        System.out.println("there are two choices \n 1:male \n 2:female");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("your choice is male");
                omale.Displaymale();
                break;
            case 2:
                System.out.println("your choise is female");
                ofemale.Displaymale();
                break;

        }
    }
}