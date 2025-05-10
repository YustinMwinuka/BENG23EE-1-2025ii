public abstract class USERS{
    private final String name;
    private final int age;
    private final String email;
    private final String gender;
    public USERS(String name, int age, String email, String gender) {
        this.name = name;
        this.age= age;
        this.email= email;
        this.gender= gender;
    }
    <display> display INSTRUCTOR (){
        System.out.println("name: " + name);
        System.out.println("age: " +  age);
        System.out.println("email: " + email);
        System.out.println("gender: " + gender);
        return null;
        }
        protected void displayInfo(){

        }
    }
