package Tregulov.Lambda;

public class Student {
    String name;
    char sex;
    int age;
    double averageGrade;

    public Student(String name, char sex, int course, double averageGrade) {
        this.name = name;
        this.sex = sex;
        this.age = course;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student: " + name + " " + sex + " " + age + " " + averageGrade;
    }


}
