public class Triangle extends Shape{
    public Triangle(double base, double height){
        super( base, height);
    }

   // method overriding: redefining an already implemented method (in super class) in the child class
    @Override
    public double area() {
        return 0.5* getBreadth() * getLength();
    }
}
