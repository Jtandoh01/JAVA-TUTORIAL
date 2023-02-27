public class inheritanceMain {
    public static void main(String[] args){
        Rectangle shapeRectangle = new Rectangle(3.5,2.1);
        System.out.println("Area of rectangle is "  + shapeRectangle.area()+ " units squared.");

        Triangle shapeTriangle = new Triangle(12.0,3.0);
        System.out.println("The area of the triangle is " + shapeTriangle.area()+ " units squared.");
    }
}
