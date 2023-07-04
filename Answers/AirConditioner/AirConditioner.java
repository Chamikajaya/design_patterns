package Q1.AirConditioner;

public class AirConditioner implements Cooler, Heater{

    private final double desiredTemp = 25.0;
    private double differenceInTemp = 3; //Assume that the difference in temperature is 3 degrees. (When colling and heating the room)
    private double currentTemp ;

    public AirConditioner(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public void changeTemp() {
        if (currentTemp < desiredTemp) {
            heatingTheRoom();
            currentTemp += differenceInTemp;
        } else if (currentTemp > desiredTemp) {
            coolingTheRoom();
            currentTemp -= differenceInTemp;
        } else {
            System.out.println("The room is at the desired temperature.");
        }
    }

    public void automatedChecker(){
       while (true){
            changeTemp();
            try {
                Thread.sleep(10000);  // So that every checking is done every 10 seconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
       }
    }

    public void coolingTheRoom() {
        System.out.println("Cooling the room...");
    }

    public void heatingTheRoom() {
        System.out.println("Heating the room...");
    }
}
