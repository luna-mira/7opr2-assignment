import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class SchoolSystem {
    private Set<Student> students = new HashSet<>();
    private Set<Course> courses = new HashSet<>();
    private Set<Lecturer> lecturers = new HashSet<>();

    public void gradeStudent(Student student, Course course, int gradeValue, Lecturer lecturer) {
        Grade grade = new Grade(gradeValue, lecturer);
        student.addGrade(course, grade);
    }
}
