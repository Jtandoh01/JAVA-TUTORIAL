public class Car {
    private String make;
    private String model;
    private int year;
    private double speed;

    public Car(String make, String model, int year, double speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed -= 7;
    }
}


