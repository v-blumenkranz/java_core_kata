package Tregulov.Generics.Play;

public class TestPlay {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Корякин Максим", 17);
        Pupil pupil2 = new Pupil("Яровцева Валерия", 13);

        Pupil pupil3 = new Pupil("Блюменкранц Алексей", 17);
        Pupil pupil4 = new Pupil("Самойлов Илья", 13);

        Student student1 = new Student("Комаров Иван", 25);
        Student student2 = new Student("Попова Алена", 22);

        Employee employee1 = new Employee("Челискин Тохтамыш", 45);
        Employee employee2 = new Employee("Козакова Людмила", 50);

        Team pupils = new Team("Бодрые кабачки");
        pupils.addNewParticipant(pupil1);
        pupils.addNewParticipant(pupil2);

        Team pupils2 = new Team("Тухлые кабачки");
        pupils2.addNewParticipant(pupil3);
        pupils2.addNewParticipant(pupil4);

        Team students = new Team("Упорные лошадки");
        students.addNewParticipant(student1);
        students.addNewParticipant(student2);

        Team employees = new Team("Усердные принтеры");
        employees.addNewParticipant(employee1);
        employees.addNewParticipant(employee2);

        pupils.playWith(pupils2);


    }
}
