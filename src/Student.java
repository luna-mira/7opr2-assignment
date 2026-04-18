import lombok.Getter;

@Getter
public class Student {
    private String studyNumber;

    public Student(String studyNumber) {
        this.studyNumber = studyNumber;
    }
}
