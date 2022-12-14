package Cars;

public class CarGO {
    public static void main(String... args){
        Car myCar = new Car("black");
        System.out.println("My car color is " + myCar.color);
        System.out.println("My engine volume is " + myCar.engineVolume);
        myCar.paintCar("blue");
        System.out.println("After paint my car color is " + myCar.color);
        myCar.swapEngine("5.2 magnum");
        System.out.println("After swap my engine volume is " + myCar.engineVolume);

    }}
