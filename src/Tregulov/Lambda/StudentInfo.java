package Tregulov.Lambda;

import java.util.ArrayList;

public class StudentInfo {

    void testStudents(ArrayList<Student> aL, StudentChecks cs) {
        for (Student s : aL) {
            if (cs.studentCheck(s)) {
                System.out.println(s);
            }
        }

    }

    /*void printStudentsOverGrade(ArrayList<Student> aL, double grade) {
        for(Student s : aL) {
            if(s.averageGrade > grade) {
                System.out.println(s);
            }
        }

    }

    void printStudentsUnderAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age < age) {
                System.out.println(s);
            }
        }

    }

    void printStudentsMixedCondition(ArrayList<Student> aL, int age, double grade, char sex) {
        for (Student s : aL) {
            if (s.age > age && s.averageGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }*/
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Иванов", 'м', 46, 3.4);
        Student st2 = new Student("Иванова", 'ж', 20, 10.0);
        Student st3 = new Student("Сидорова", 'ж', 19, 9.3);
        Student st4 = new Student("Казаков", 'м', 35, 5.6);
        Student st5 = new Student("Кутяпкин", 'м', 25, 7.2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());
        System.out.println("-------------------------");
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean studentCheck(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("-------------------------");
        info.testStudents(students, (Student s) -> {return s.age < 30;});




        /*info.printStudentsOverGrade(students, 5);
        System.out.println("-------------------------");
        info.printStudentsUnderAge(students, 25);
        System.out.println("-------------------------");
        info.printStudentsMixedCondition(students, 25, 5, 'м');*/
    }
}
interface StudentChecks {
        boolean studentCheck(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean studentCheck(Student s) {
        return s.averageGrade > 5;
    }
}
