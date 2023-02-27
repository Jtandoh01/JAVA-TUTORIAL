public class Main {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        rectangle1.setWidth(4);
        rectangle1.setHeight(8);
        rectangle1.setColor("Yellow");
        rectangle2.setWidth(3);
        rectangle2.setHeight(6);
        rectangle2.setColor("Orange");

        circle1.setRadius(6.0);
        circle1.setColor("Blue");
        circle2.setRadius(4.0);
        circle2.setColor("Green");

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println();
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }


}
