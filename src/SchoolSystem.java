import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class SchoolSystem {
    private Set<Student> students;
    private Set<Course> courses;

    public SchoolSystem(Set<Student> students, Set<Course> courses) {
        this.students = students;
        this.courses = courses;
    }
}
