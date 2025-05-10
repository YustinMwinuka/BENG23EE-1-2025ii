
    class Instructor extends USERS {
        private String position;
        private String qualification;

        public Instructor(String name, int age, String email, String gender, String position, String qualification) {
            super(name, age, email, gender);
            this.position = position;
            this.qualification = qualification;
        }

        public void displayInstructorInfo() {
            super.displayInfo();
            System.out.println("Position: " + position);
            System.out.println("Qualification: " + qualification);
        }


    }