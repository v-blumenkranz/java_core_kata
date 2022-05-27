package Lecture4.Robot;

public interface RobotConnectionManager {
    //Метод делает попытку соединиться с роботом и возвращает установленное соединение,
    // через которое можно отдавать роботу команды.
    RobotConnection getConnection();
}
