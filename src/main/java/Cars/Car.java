package Cars;

public class Car {
    public String color;
    public String engineVolume;

    public Car(String params) {
        color = params;
        engineVolume = "3l OM606";
    }
    public void paintCar(String change){
        color = change;
    }
    public void swapEngine(String change){
        engineVolume = change;
    }
    //public String getCarparams(){ // на случай, если параметры будут private
    //    return color;}

    }
