import java.util.ArrayList;
import java.util.List;

public class SampleData {

    public static List<Student> getSampleStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice Smith", 15, "Female", "Greenwood High", "9876543210", "10", "CBSE", "Math", "Algebra", "History", "Ancient Civilizations", "Online"));
        students.add(new Student("Bob Johnson", 16, "Male", "Silver Oak School", "9876543211", "11", "ICSE", "Physics", "Mechanics", "English", "Poetry", "Offline"));
        students.add(new Student("Charlie Davis", 14, "Male", "Bright Future Academy", "9876543212", "9", "State Board", "Biology", "Genetics", "Math", "Geometry", "Hybrid"));
        students.add(new Student("Diana Lee", 17, "Female", "Riverdale High", "9876543213", "12", "CBSE", "Chemistry", "Organic Chemistry", "Physics", "Optics", "Online"));
        students.add(new Student("Ethan Brown", 15, "Male", "Lakewood School", "9876543214", "10", "ICSE", "History", "World War II", "Biology", "Human Anatomy", "Offline"));
        students.add(new Student("Fiona White", 16, "Female", "Mountain View School", "9876543215", "11", "State Board", "English", "Literature", "Chemistry", "Periodic Table", "Hybrid"));
        students.add(new Student("George Miller", 14, "Male", "Sunshine Academy", "9876543216", "9", "CBSE", "Math", "Calculus", "History", "Medieval History", "Online"));
        students.add(new Student("Hannah Clark", 15, "Female", "Starlight School", "9876543217", "10", "ICSE", "Physics", "Electromagnetism", "Biology", "Ecology", "Offline"));
        students.add(new Student("Ian Walker", 17, "Male", "Hilltop High", "9876543218", "12", "State Board", "Chemistry", "Inorganic Chemistry", "English", "Drama", "Hybrid"));
        students.add(new Student("Jasmine Young", 16, "Female", "Lakeside Academy", "9876543219", "11", "CBSE", "Biology", "Cell Biology", "Math", "Trigonometry", "Online"));

        return students;
    }
}
