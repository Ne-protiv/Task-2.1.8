public class Task {
    public static void main(String[] args) {
        Robot bobby = new Robot(110, 2, Robot.Direction.UP);// задаем начальное положение робота
        int toX = 100; // куда он должен приехать
        int toY = -100;
        System.out.println("Начальное положение: "+ bobby.getX() + "," + bobby.getY() + "," + bobby.getDirection());
        moveRobot(bobby, toX, toY);
        System.out.println("Окончательное положение: "+bobby.getX() + "," + bobby.getY() + "," + bobby.getDirection());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        if (x < toX) {
            while (robot.getDirection() != Robot.Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        if (x > toX) {
            while (robot.getDirection() != Robot.Direction.LEFT) {
                robot.turnLeft();
            }
        }
        while (x != toX) {
            robot.stepForward();
            x = robot.getX();
        }
        if (y < toY) {
            while (robot.getDirection() != Robot.Direction.UP) {
                robot.turnLeft();
            }
        }
        if (y > toY) {
            while (robot.getDirection() != Robot.Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (y != toY) {
            robot.stepForward();
            y = robot.getY();
        }
    }
}
