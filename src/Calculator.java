

    import java.util.Scanner;

public class Calculator {
    //properties
     private int leftOperand, rightOperand;

    //A property defined with the static keyword can also be accessed with the class name
        public static int staticProps = 5;

    // make constants static variables  as well
    // Use the final keyword to enforce that it cannot be changed
    // constant variable names are written in all capsn
    public final static double PI = 3.142;


     //constructor: is a method-like function with strict rules
    //rule1: cannot have a return type,return keyword cannot be used here not even void
    //rule2: must have same name with same caps  as the class


    //by default, every class has a no-arg constructor

    public Calculator(){

    }

    public Calculator(int leftOperand, int rightOperand){

        this.leftOperand= leftOperand;
        this.rightOperand= rightOperand;
    }

    //methods

    /**
     * signature of a method:
     * begins with visibility modifier: private, public, protected
     * public means accessible to all
     * protected means accessible to all in the same package
     * private means accessible only with the class in which it was declared
     * Next is the return type : Data type or bject type returned by the method using the return keyword
     * Next is  the method name
     * Optional is the arguments: when input is requested from the user
     * @return
     */
    public int add(){
    return this.leftOperand + this.rightOperand;
    }
    //method overloading is defining several methods with the same name but with different parameters and thus different implementations
    //examples: in the following methods, same add() methods are implemented but with different
    //static methods do not require the creation of an object of the class: use the 'static' keyword to achieve this

    public static int add(int num1, int num2 ){
        return num1+num2;
    }
    public static double add(double num1, double num2){
        return num1+num2;
    }
    public static double add(int num1, double num2 ){
        return num1+ num2;
    }
    public static double add(double num1, int num2){
        return num1+num2;
    }
    public static double add(double num1, double num2,double num3){
        return num1+num2+num3;
    }

    public int subtract(){
        return this.leftOperand - this.rightOperand;
    }

    public int multiply(){
        return this.leftOperand * this.rightOperand;
    }
    public int divide(){
        return this.leftOperand / this.rightOperand;
    }
    // getters and setters: methods named using the property name prepended by the words get or set
    // getter is a method that returns the value of the property it is named after
    //setter is a method that sets the value of the property it is named after

    //getter methods
    public int getLeftOperand(){
        return leftOperand;
    }
    public int getRightOperand(){
        return rightOperand;
    }

    //setter methods

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }
}





