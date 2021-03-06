
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for robot
        City jk = new City();
        Robot bob = new Robot(jk, 5, 1, Direction.NORTH);
        //Create Walls
        new Wall(jk, 4, 1, Direction.WEST);
        new Wall(jk, 4, 1, Direction.NORTH);
        new Wall(jk, 5, 1, Direction.WEST);
        new Wall(jk, 6, 1, Direction.WEST);
        new Wall(jk, 6, 1, Direction.WEST);
        new Wall(jk, 6, 1, Direction.WEST);
        new Wall(jk, 6, 2, Direction.SOUTH);
        new Wall(jk, 6, 3, Direction.SOUTH);
        new Wall(jk, 6, 4, Direction.SOUTH);
        new Wall(jk, 6, 1, Direction.SOUTH);
        new Wall(jk, 5, 4, Direction.EAST);
        new Wall(jk, 4, 4, Direction.EAST);
        new Wall(jk, 6, 4, Direction.EAST);
        new Wall(jk, 4, 3, Direction.NORTH);
        new Wall(jk, 4, 4, Direction.NORTH);


        //while loop with condition{
        while (bob.getDirection() == Direction.SOUTH) {
                bob.turnLeft();
                bob.turnLeft();
            }
        
        while (bob.frontIsClear()) {
            bob.move();
        }


        while (true) {
            while (!bob.frontIsClear()) {
                bob.turnLeft();
                bob.move();

            }
            if (bob.frontIsClear()) {
                bob.move();

                if (!bob.frontIsClear()) {
                    bob.turnLeft();
                }
            }

            if (!bob.isBesideThing(IPredicate.aWall)) {
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                break;
            }


        }

    }
}
