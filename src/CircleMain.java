public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.setRadius(5.0);
        c2.setRadius(4.5);
        System.out.println("Circle 1:");
        System.out.println("Radius = " + c1.getRadius());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Circumference = " + c1.getCircumference());
        System.out.println();

        System.out.println("Circle 2:");
        System.out.println("Radius = " + c2.getRadius());
        System.out.println("Area = " + c2.getArea());
        System.out.println("Circumference = " + c2.getCircumference());


    }
}