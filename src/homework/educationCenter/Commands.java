package homework.educationCenter;

public interface Commands {
    String EXIT = "0";
    String ADD_STUDENT = "1";
    String ADD_LESSON = "2";
    String PRINT_STUDENT = "3";
    String PRINT_LESSONS = "4";
    String SEARCH_STUDENT_BY_NAME_OR_SURNAME = "5";
    String SEARCH_LESSON_BY_NAME = "6";
    String SEARCH_STUDENT_BY_LESSON_NAME = "7";
    String CHANGE_LESSON_BY_EMAIL = "8";
    String CHANGE_PHONE = "9";
}
