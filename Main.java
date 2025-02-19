import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = SampleData.getSampleStudents();
        List<Student[]> matchedStudents = StudentMatcher.matchStudents(students);

        // Print matches
        for (Student[] pair : matchedStudents) {
            System.out.println("Match: " + pair[0].getName() + " and " + pair[1].getName());
        }
    }
}
