public class Circle {
    private double radius;


     public double getArea(){
         return Math.PI * radius * radius;
     }
     public double getCircumference(){
         return Math.PI * radius* 2;
     }
     public double getRadius(){
         return radius;

     }
    public void setRadius(double radius){
        this.radius = radius;
    }

}