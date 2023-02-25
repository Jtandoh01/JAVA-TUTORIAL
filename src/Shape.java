public class Shape {
    //properties
    private double length, breadth;

    //constructor method
    public Shape(double length, double breadth){
        this.length= length;
        this.breadth= breadth;
    }

    public double area(){
        return length * breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}
