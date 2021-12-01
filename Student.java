import java.util.Objects;

public class Student {
    private String name;
    private int year;

    public Student(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return String.format("[%s, %d학년]", name, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return year == student.year && Objects.equals(name, student.name);
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}