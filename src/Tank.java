public class Tank {
    private int coordinateX;
    private int coordinateY;
    private int route = 0; // 1 = up ; 2 = right; 3 = down ; 4 = left ;
    private int fuel;

    private final String tankNumber = "" + (tankCount + 1);
    private final String tankModel = "T34";  // vasche ne prosto

    private static int tankCount = 0;

    void goForward(int pathWay) {
        if (route == 0) changeX(pathWay);
        if (route == 3) changeY(pathWay);
        if (route == 2) changeX(-pathWay);
        if (route == 1) changeY(-pathWay);
        routeCheck();
    }
    void goBackward(int pathWay) {
        goForward(-pathWay);
        routeCheck();
    }

    void printPosition() {
        System.out.println("The Tank " + tankModel + "-" + tankNumber + " is at " + coordinateX + ", " + coordinateY + " now.");
    }

    void turnLeft() {
        --route;
        if (route < 0) {
            route = 3;
        }
    }

    void turnRight() {
        ++route;
        if (route > 3) {
            route = 0;
        }
    }

    void changeX(int i) {
        if (i < 0) {
            if (Math.abs(i) <= fuel) {
                coordinateX += i;
                fuel -= Math.abs(i);
            } else {
                coordinateX -= fuel;
                fuel -= fuel;
            }
        } else {
            if (Math.abs(i) <= fuel) {
                coordinateX += i;
                fuel -= Math.abs(i);
            } else {
                coordinateX += fuel;
                fuel -= fuel;
            }
        }
    }

    void changeY(int i) {
        if (i < 0) {
            if (Math.abs(i) <= fuel) {
                coordinateY += i;
                fuel -= Math.abs(i);
            } else {
                coordinateY -= fuel;
                fuel -= fuel;
            }
        } else {
            if (Math.abs(i) <= fuel) {
                coordinateY += i;
                fuel -= Math.abs(i);
            } else {
                coordinateY += fuel;
                fuel -= fuel;
            }
        }
    }

    void routeCheck() {
        if (route != 0 && route != 1 && route != 2 && route != 3) {
            System.out.println("Route is error!");
        }
    }

    public Tank() {
        this(0, 0);
    }

    public Tank(int coordinateX, int coordinateY) {
        this(coordinateX, coordinateY, 100);
    }

    public Tank(int coordinateX, int coordinateY, int fuel) {
        ++tankCount;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.fuel = fuel;
    }

    public static void printTankCreate() {
        System.out.println("Create new tank");
    }

    public String getTankNumber() {
        return tankNumber;
    }

    public int getTankCount() {
        return tankCount;
    }
}
