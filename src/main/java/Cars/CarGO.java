package Cars;

public class CarGO {
    public static void main(String... args){
        Car myCar = new Car("black", "145-42AA");
        System.out.println("My car color is " + myCar.color);
        System.out.println("My engine volume is " + myCar.engineVolume);
        myCar.paintCar("blue");
        System.out.println("After paint my car color is " + myCar.color);
        myCar.swapEngine("5.2 magnum");
        System.out.println("After swap my engine volume is " + myCar.engineVolume);

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        switchStatement("a");
        // switchStatement("b");
        switchStatement("c");
        switchStatement("S");
    }

    public void printAllElements(String[] stringArray) {
        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    public static void switchStatement(String switchString){

        switch (switchString){
            case "a":
                System.out.println("this is a");
                break;
            case "b":
                System.out.println("this is b");
                break;
            case "c":
                System.out.println("this is c");
                break;
            default:
                System.out.println("default");
        }
    }
    }


