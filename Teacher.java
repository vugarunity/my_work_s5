public class Teacher {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final int age;

    public Teacher(Long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + firstName + " " + lastName + ", Возраст: " + age;
    }
}
