public class InterfaceTest {
    public static void main(String[] args) {
        Movable plane = new Airplane();
        plane.move();

        Movable car = new Car();
        car.move();
    }
}
