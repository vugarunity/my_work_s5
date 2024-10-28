import java.util.List;

public class StudyGroup {
    private final Teacher teacher;
    private final List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Учебная группа:\nПреподаватель: " + teacher + "\nСтуденты: " + students;
    }
}
