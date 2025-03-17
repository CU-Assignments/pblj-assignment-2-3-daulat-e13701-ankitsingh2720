import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 72),
            new Student("Charlie", 90),
            new Student("David", 76)
        );

        // Filtering students with marks above 75% and sorting by marks in descending order
        List<String> topStudents = students.stream()
            .filter(s -> s.marks > 75)
            .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks)) // Descending order
            .map(s -> s.name) // Extracting names
            .collect(Collectors.toList());

        // Displaying names of filtered students
        topStudents.forEach(System.out::println);
    }
}
