public class Recktangle {
            private double width, height;

    // constructor

    public Recktangle(double width, double height) {
        this.width = width;
        this.height = height;
    }




    public double getArea(){
                return width*height;
    }//Area getter

    public double getPerimeter(){
                return 2*(width+height);
    }// Perimeter getter


}
