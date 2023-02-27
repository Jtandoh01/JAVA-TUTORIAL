public class Circle extends AbstractShape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Rectangle{radius=" + radius +
                ", color='" + getColor() + '\'' +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
