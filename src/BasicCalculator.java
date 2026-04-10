import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

    Scanner twoFloatingPoints = new Scanner(System.in);
    System.out.print ("Enter the first number: ");
    double firstNumber = twoFloatingPoints.nextDouble();
    System.out.print ("Enter the second number: ");
    double secondNumber = twoFloatingPoints.nextDouble();
    Scanner calculationMethod = new Scanner(System.in);
    System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
    System.out.print ("Please select an option: ");
    String mathFunction = calculationMethod.nextLine();
    if (mathFunction.equals("A")) {
        System.out.println(firstNumber + secondNumber);
    }
    if (mathFunction.equals("S")) {
        System.out.println(firstNumber - secondNumber);
    }
    if (mathFunction.equals("M")) {
        System.out.println(firstNumber * secondNumber);
    }
    if (mathFunction.equals("D")) {
        System.out.println(firstnumber + firstNumber / secondNumber);
    }
    else
        System.out.println("Try again silly boi.");





    }
}

