public class Main {


    public static void main(String[] args) {
/*
Make (add code to class Tank),
with fuel and different constructors
*/

        // At (0;0) fuel=100
        Tank justTank = new Tank();
        Tank.printTankCreate();
        // At (10;10) fuel=100
        Tank anywareTank = new Tank(10, 10);
        Tank.printTankCreate();
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        Tank newCustomTank = new Tank(20, 30, 200);
        Tank.printTankCreate();
        System.out.println("Total tanks we have: " + justTank.getTankCount() + " pcs");

        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

        newCustomTank.goForward(201);
        newCustomTank.printPosition();

        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(500);
        tank.printPosition();

        System.out.println("vot prosto tak 1");

/*
This fragment of code has to output

The Tank is at 100, 0 now.
The Tank is at 110, 10 now.
The Tank is at 220, 30 now.

*/
    }

}
