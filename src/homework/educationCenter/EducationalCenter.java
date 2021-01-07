package homework.educationCenter;

import homework.educationCenter.Storage.LessonStorage;
import homework.educationCenter.Storage.StudentStorage;
import homework.educationCenter.exception.LessonNotFoundException;
import homework.educationCenter.model.Lesson;
import homework.educationCenter.model.Student;

import java.util.Scanner;

public class EducationalCenter implements Commands {
    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            showCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;                   //System.exit(0);
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_STUDENT:
                    studentStorage.print();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case SEARCH_STUDENT_BY_NAME_OR_SURNAME:
                    System.out.println("Please input name or surname for search");
                    String nameOrSurname = scanner.nextLine();
                    studentStorage.searchByNameOrSurname(nameOrSurname);
                    break;
                case SEARCH_LESSON_BY_NAME:
                    System.out.println("Please input lesson name for search");
                    String LessonName = scanner.nextLine();
                    lessonStorage.searchLessonByName(LessonName);
                    break;
                case SEARCH_STUDENT_BY_LESSON_NAME:
                    searchStudentByLessonName();
                    break;
                case CHANGE_LESSON_BY_EMAIL:
                    changeStudentLesson();
                    break;
                case CHANGE_PHONE:
                    changePhoneByEmail();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }

    ////1
    private static void addStudent() {
        if (lessonStorage.isEmpty()) {
            System.out.println("Please add lesson first");
            addLesson();
        } else {
            System.out.println("Please select lesson[name] from list");
            lessonStorage.printNames();
            String lessonName = scanner.nextLine();
            Lesson lesson = null;
            try {
                lessonStorage.getByName(lessonName);
                System.out.println("Please input name, surName, phone, email of student");
                String studentDataStr = scanner.nextLine();
                String[] studentData = studentDataStr.split(",");
                Student student = new Student(studentData[0], studentData[1], studentData[2], studentData[3], lesson);
                studentStorage.add(student);
                System.out.println("Student was added!");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" Invalid data");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
    }


    ////2
    private static void addLesson() {
        System.out.println("Please input lessonName, duration, price,lecturerName");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        try {
            String lessonName = lessonData[0];
            try {
                lessonStorage.getByName(lessonName);
                System.out.println("Lesson with" + lessonName + "already exists");
            } catch (LessonNotFoundException e) {

                int duration = Integer.parseInt(lessonData[1]);
                double price = Double.parseDouble(lessonData[2]);
                String lecturerName = lessonData[3];
                Lesson lesson = new Lesson(lessonName, duration, price, lecturerName);
                lessonStorage.add(lesson);
                System.out.println("Lesson was added!");
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Invalid data");
        } catch (NumberFormatException e1) {
            System.out.println("Invalid number");
        }
    }

    ////7
    private static void searchStudentByLessonName() {
        System.out.println("Please input lesson name from list");
        lessonStorage.printNames();
        String lessonName = scanner.nextLine();
        Lesson byName = null;
        try {
            byName = lessonStorage.getByName(lessonName);
            studentStorage.searchByLessonName(byName);
        } catch (LessonNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    ////8
    private static void changeStudentLesson() {
        System.out.println("Please input email");
        Student student = studentStorage.getStudentByEmail(scanner.nextLine());
        if (student != null) {
            System.out.println("Please choose [new lesson name] for change Lesson ");
            lessonStorage.printNames();
            String lessonName = scanner.nextLine();
            Lesson newLesson = null;
            try {
                newLesson = lessonStorage.getByName(lessonName);
                student.setLesson(newLesson);
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("There is no student by that email");
            changeStudentLesson();
        }
    }

    ////9
    private static void changePhoneByEmail() {
        System.out.println("Please input email");
        Student student = studentStorage.getStudentByEmail(scanner.nextLine());
        if (student != null) {
            System.out.println(student);
            System.out.println("Please input new phone");
            String phone = scanner.nextLine();
            student.setPhone(phone);
        } else {
            System.out.println("There is no student by that email");
            changePhoneByEmail();
        }
        System.out.println(student);
    }

    public static void showCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_STUDENT + " for ADD STUDENT");
        System.out.println("PLease input " + ADD_LESSON + " for ADD LESSON");
        System.out.println("Please input " + PRINT_STUDENT + " for PRINT STUDENTS");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT LESSONS");
        System.out.println("Please input " + SEARCH_STUDENT_BY_NAME_OR_SURNAME + " for Search student By Name Or Surname");
        System.out.println("Please input " + SEARCH_LESSON_BY_NAME + " for Search Lesson By Name");
        System.out.println("Please input " + SEARCH_STUDENT_BY_LESSON_NAME + " for Search student By Lesson Name");
        System.out.println("Please input " + CHANGE_LESSON_BY_EMAIL + " for change Lesson by email");
        System.out.println("Please input " + CHANGE_PHONE + " for change phone");
    }
}

