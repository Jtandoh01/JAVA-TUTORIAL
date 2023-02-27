import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        int operation;
        double result = 0;
        // I want to use the switch case here
        // This will prompt the user to choose the kind of operation they want to perform
        System.out.println("Enter operation number: 1.To ADD 2.To SUBTRACT 3.To DIVIDE 4.To MULTIPLY");
        operation = scanner.nextInt();

        System.out.println("Enter first number: ");
        calc.setLeftOperand( scanner.nextInt());


        System.out.println("Enter second number: ");
        calc.setRightOperand( scanner.nextInt());
        int noUse= Calculator.staticProps;

        switch(operation){
            case 1:
                result= Calculator.add( 1, 1.3);
                break;
            case 2:
                result= calc.subtract();
                break;
            case 3:
                result = calc.divide();
                break;
            case 4:
                result = calc.multiply();
                break;
            default:
                System.out.println("Invalid Input");

        }



        System.out.println("Result is: "+ result + ".");
    }




}

