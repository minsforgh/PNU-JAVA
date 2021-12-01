package edu.pnu.admin;
import edu.pnu.collection.*;

public class School {
    private final String name;
    private int limit;
    private GenericList<Student> students;

    public School(String name, int limit) {
        this.name = name;
        this.limit = limit;
        students = new GenericList<>(limit);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeAllStudent() {
        students.clear();
    }

    public Student findStudent(String name, int year) {
        int size = students.getSize();
        Student to_find = new Student(name,year);
        for(int i = 0; i < size; i++) {
            if(students.get(i).equals(to_find))
                return students.get(i);
        }
        return null;
    }

    public String toString() {
        int size = students.getSize();
        String msg = "School Name: " + name + " Student Count: " + size + "\n";
        for(int i = 0; i < size; i++) {
            msg += "\t" + students.get(i) + "\n";
        }
        return msg;
    }
}