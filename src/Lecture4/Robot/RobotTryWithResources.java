package Lecture4.Robot;

public class RobotTryWithResources implements RobotConnection, RobotConnectionManager, AutoCloseable {
    @Override
    public void close() {

    }

    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }

    public static void moveRobot (RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException, Exception, RuntimeException {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 5;
            } catch (RobotConnectionException robotConnectionException) {
                if (i == 2) {
                    throw new RobotConnectionException("Упс... Соединение прервалось");
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}

