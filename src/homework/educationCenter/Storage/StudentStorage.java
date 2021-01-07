package homework.educationCenter.Storage;

import homework.educationCenter.model.Lesson;
import homework.educationCenter.model.Student;

public class StudentStorage {
    Student[] students = new Student[40];
    private int size;

    public void add(Student value) {
        if (size == students.length) {
            extend();
        }
        students[size++] = value;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void searchByNameOrSurname(String nameOrSurname) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().contains(nameOrSurname)
                    || students[i].getSurName().contains(nameOrSurname)) {
                System.out.println(students[i]);
            }
        }
    }


    public Student getStudentByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void searchByLessonName(Lesson byName) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(byName)) {
                System.out.println(students[i]);
            }
        }
    }
}
