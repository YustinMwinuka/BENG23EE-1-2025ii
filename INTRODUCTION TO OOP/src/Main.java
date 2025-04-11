import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Female ofemale = new Female();
        Male omale = new Male();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                omale.DisplayMale();
                break;
            case 2:
                ofemale.DisplayFemale();
                break;
        }
    }
}


