package Cars;

public class Car {
    public String color;
    public String engineVolume;
    public int speed;
    public String currentTrafficLight;
    private String licencePlate;

    public Car(String params, String plateNumber) {
        color = params;
        engineVolume = "3l OM606";
        speed = 0;
        currentTrafficLight = "yellow";
        licencePlate = plateNumber;
    }

    public String getCurrentTrafficLight() {
        return currentTrafficLight;
    }
    public void setCurrentTrafficLight(String newTrafficLight) {
        switch (newTrafficLight){
            case ("red"):
                speed = 0;
                currentTrafficLight = newTrafficLight;
                break;
            case ("yellow"):
                currentTrafficLight = newTrafficLight;
                break;
            case ("green"):
                speed = 60;
                currentTrafficLight = newTrafficLight;
                break;
            default:
                System.out.println("Do nothing");
        }
    }
    public void crossTheCrossroad(Car[] otherCars){
        for (int i=0; i<otherCars.length; i++){
            if (licencePlate != (otherCars[i].licencePlate)){
                if (speed !=0 && otherCars[i].speed !=0){
                    System.out.println("Car accident between " + licencePlate + " and " + otherCars[i].licencePlate);
                } else {System.out.println("We passed by");}
            }}}

    public void paintCar(String change){
        color = change;
    }
    public void swapEngine(String change){
        engineVolume = change;
    }


    }

