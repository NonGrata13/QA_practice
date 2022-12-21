package Cars;

public class TrafficLightsGO {
    public static void main(String... args){
        TrafficLights trafficLights = new TrafficLights();
       Car myCar = new Car("black", "145-42AA");
       Car bobsCar = new Car("white", "AE0001KE");
       Car aliceCar = new Car("grey", "AE0002KE");
       Car copsCar = new Car("blue", "AE0003KE");

       Car[] crossingCars = {myCar, bobsCar, aliceCar, copsCar};
      trafficLights.showSignal(myCar, "green");
      trafficLights.showSignal(copsCar, "green");
       moveCars(crossingCars);
    }
    public static void moveCars(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            cars[i].crossTheCrossroad(cars);
            
        }
    }
}
