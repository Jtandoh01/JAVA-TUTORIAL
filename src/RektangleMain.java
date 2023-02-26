public class RektangleMain {
    public static void main(String[] args){
        //creating two rectangle objects and assigning their attributes
        Recktangle rectangle1 = new Recktangle(4.0,5.0);
        Recktangle rectangle2 = new Recktangle(12.0, 10.0);

        //Demonstrating the use of the getArea() and getPerimeter() methods

        System.out.println("Rectangle1: " );
        System.out.println("Area of rectangle1 is "+rectangle1.getArea()+"." );
        System.out.println("Perimeter of rectangle1 is "+rectangle1.getPerimeter()+"." );
        System.out.println();

        System.out.println("Rectangle2: " );
        System.out.println("Area of rectangle2 is "+rectangle2.getArea()+"." );
        System.out.println("Perimeter of rectangle2 is "+rectangle2.getPerimeter()+"." );



    }




}
