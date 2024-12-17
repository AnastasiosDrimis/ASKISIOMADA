public class Airplane {
    private String airplane;
    private String location;
    private double fuelCapacity;
    public Airplane(String airplane, String location, double fuelCapacity ) {
        this.airplane = airplane;
        this.location = location;
        this.fuelCapacity = fuelCapacity;
    }
    public boolean needRefueling( double remainingFuel, double needFuel) {
        if remaingFuel < needfuel {
            public double refuel( double remainingFuel, double fuelCapacity) {
                do {
                    remainingFuel = remainingFuel + 1000;
                }
                while (remainingFuel = fuelCapacity)
            } 
        }
    }
    double fuels = 0;
    public double fuelSpending(double remainingFuel, double fuelCapacity) {
        fuels = fuelCapacity - remainingFuel;
    }
    public String getAirplane() {
        return airplane;
    }
    public String getlocation() {
        return location;
    }
    public double getfuelCapacity() {
        return fuelCapacity;
    }
    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
