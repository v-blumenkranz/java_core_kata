package Lecture4.Robot;

public class Robot implements RobotConnection, RobotConnectionManager {
    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close() {

    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }

    public static void moveRobot (RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException, Exception, RuntimeException {
        RobotConnection robotConnection = null;
        int i = 0;
        while (i < 3) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException robotConnectionException) {
                if (i >= 2) {
                    throw new RobotConnectionException("Упс... Соединение прервалось");
                }
            } catch (RuntimeException e) {
                if (i >= 2) {
                    try {
                        robotConnection.close();
                    } catch (Exception exception) {

                    }
                    throw new RuntimeException();
                }
            } finally {
                try {
                    robotConnection.close();
                } catch (Exception e) {

                }
            }
            i++;
        }
    }







    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.moveRobotTo(12, 13);
    }
}
