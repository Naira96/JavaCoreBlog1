package homework.educationCenter.model;

import homework.educationCenter.model.Lesson;

public class Student {
    private String name;
    private String surName;
    private String phone;
    private String email;
    private Lesson lesson;

    public Student(String name, String surName, String phone, String email, Lesson lesson) {
        this.name = name;
        this.surName = surName;
        this.phone = phone;
        this.email = email;
        this.lesson = lesson;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surName != null ? !surName.equals(student.surName) : student.surName != null) return false;
        if (phone != null ? !phone.equals(student.phone) : student.phone != null) return false;
        if (email != null ? !email.equals(student.email) : student.email != null) return false;
        return lesson != null ? lesson.equals(student.lesson) : student.lesson == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (lesson != null ? lesson.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", lesson=" + lesson +
                '}';
    }
}