// StudentRegistry class to test the Student class
public class StudentRegistry {
    public static void main(String[] args) {
        // Step 1: Create two instances of the Student class
        Student student1 = new Student();
        Student student2 = new Student();
        
        // Step 2: Use setter methods to set values for all attributes of first student
        // Example values: ID "S001", name "John Doe", grade 85.5, active true
        student1.setStudentId("S001");
        student1.setName("Minidu Sathsara");
        student1.setGrade(85.5);
        student1.setIsActive(true);

        // Step 3: Set values for second student
        // Example values: ID "S002", name "Jane Smith", grade 92.0, active true
        student2.setStudentId("S002");
        student2.setName("Divya Thathsarani");
        student2.setGrade(93.5);
        student2.setIsActive(true);

        // Step 4: Display details of both students     
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        
        // Step 5: Compare the grades of the two students and print who has the higher grade
        // Hint: Create a separate method for this comparison
        Student higherGraStudent = compareGrades(student1, student2);
        System.out.println("\nComparing Grades....");
        System.out.println(higherGraStudent.getName() + " has the higher grade with " + higherGraStudent.getGrade());
        
        // Step 6: Test the letter grade method for both students
        System.out.println("\nLetter Grade:");
        System.out.println(student1.getName() + "'s Letter Grade is " + student1.getLetterGrade());
        System.out.println(student2.getName() + "'s Letter Grade is " + student2.getLetterGrade());
        
        // Step 7: Test the passing status method for both students
        System.out.println("\nPassing Status");
        System.out.println(student1.getName() + " is " + (student1.isPassing() ? "passing" : "not passing"));
        System.out.println(student2.getName() + " is " + (student2.isPassing() ? "passing" : "not passing"));

        // Step 8: Change one student to inactive and display the updated information
        System.out.println("\nChanging " + student1.getName() + "'s status into inactive");
        student1.setIsActive(false);
        student1.displayStudentDetails();
    }
    
    // Step 9: Create a static method to compare two students' grades and return the student with the higher grade
    // Hint: Take two Student objects as parameters
    public static Student compareGrades(Student student1, Student student2){
        if(student1.getGrade() > student2.getGrade()){
            return student1;
        } else {
            return student2;
        }
    }
}
