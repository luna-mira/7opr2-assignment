import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lecturer {
    private String name;

    public Lecturer(String name) {
        this.name = name;
    }
}
