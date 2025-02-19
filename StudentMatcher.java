import java.util.ArrayList;
import java.util.List;

public class StudentMatcher {

    public static List<Student[]> matchStudents(List<Student> students) {
        List<Student[]> matches = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                Student s1 = students.get(i);
                Student s2 = students.get(j);

                // Match based on favorite and hated subjects and grades
                if (isMatch(s1, s2)) {
                    matches.add(new Student[]{s1, s2});
                }
            }
        }

        return matches;
    }

    private static boolean isMatch(Student s1, Student s2) {
        // Check if favorite subjects match with hated subjects and similar grades
        boolean subjectMatch = s1.getMostStrongSubject().equals(s2.getMostHatedSubject())
                && s1.getStrongSubtopic().equals(s2.getHatedSubtopic())
                || s2.getMostStrongSubject().equals(s1.getMostHatedSubject())
                && s2.getStrongSubtopic().equals(s1.getHatedSubtopic());

        boolean gradeMatch = s1.getGrade().equals(s2.getGrade());

        return subjectMatch && gradeMatch;
    }
}
