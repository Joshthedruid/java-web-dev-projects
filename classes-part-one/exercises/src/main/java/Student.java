public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public String getName(){return name;}
        public int getStudentId(){return studentId;}
        public int getNumberOfCredits(){return numberOfCredits;}
        public double getGpa(){return gpa;}


        public void setName(String aName){name = aName;}
        private void setStudentId(int aStudentId){studentId = aStudentId;}
        public void setNumberOfCredits(int aNumberOfCredits){numberOfCredits = aNumberOfCredits;}
        public void setGpa(double aGpa){gpa = aGpa;}
}
