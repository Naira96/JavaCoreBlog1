package homework.educationCenter.Storage;

import homework.educationCenter.exception.LessonNotFoundException;
import homework.educationCenter.model.Lesson;

public class LessonStorage {
    Lesson[] lessons = new Lesson[12];
    private int size;

    public void add(Lesson value) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = value;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public Lesson getByName(String name) throws LessonNotFoundException {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equalsIgnoreCase(name)) {         //// mecatarn u poqratar@ hashvi chi arni
                return lessons[i];
            }
        }
        throw new LessonNotFoundException("Lesson with" + name + "does not exist" );
    }

    public void searchLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().contains(name)) {
                System.out.println(lessons[i]);
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public void printNames() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i].getName());
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
