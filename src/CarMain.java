public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2025, 60.0);
        Car car2 = new Car("Honda", "Civic", 2010, 45.0);

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getSpeed());
        car1.accelerate();
        System.out.println(car1.getSpeed());
        car1.brake();
        System.out.println(car1.getSpeed());
        System.out.println();

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println(car2.getSpeed());
        car2.accelerate();
        System.out.println(car2.getSpeed());
        car2.brake();
        System.out.println(car2.getSpeed());
    }
}
