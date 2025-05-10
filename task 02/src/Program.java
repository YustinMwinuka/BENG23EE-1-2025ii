    public class Program {
        String code;
        String instructor;
        String subjectName;

        public Program(String code, String instructor, String subjectName) {
            this.code = code;
            this.instructor = instructor;
            this.subjectName = subjectName;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public String getCode() {
            return code;
        }

        public String getInstructor() {
            return instructor;
        }
    }