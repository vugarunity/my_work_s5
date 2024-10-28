import java.util.Arrays;
import java.util.List;

// Основной класс запуска
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры сервисов и контроллера
        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        // Инициализируем преподавателя и студентов
        Teacher teacher = new Teacher(10L, "John", "Doe", 45);
        List<Student> students = Arrays.asList(
                new Student(1L, "Alice", "Johnson", 20),
                new Student(2L, "Bob", "Smith", 22),
                new Student(3L, "Charlie", "Brown", 23)
        );

        // Создаем учебную группу через контроллер
        StudyGroup studyGroup = controller.createStudyGroup(teacher, students);

        System.out.println(studyGroup);
    }
}