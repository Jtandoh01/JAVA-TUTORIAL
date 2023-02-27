public class Rectangle extends AbstractShape{
    private double width, height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height +
                ", color='" + getColor() + '\'' +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}

