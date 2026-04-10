import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

    //Add Scanner class
    Scanner scan = new Scanner(System.in);

    //Add the first number prompt and add a Scanner
    System.out.print ("Enter a number, any number!: ");
    double firstNumber = scan.nextDouble();

    //Add the second number prompt and add a Scanner
    System.out.print ("Enter another number, choose carefully: ");
    double secondNumber = scan.nextDouble();
    scan.nextLine(); //Added this because of the space inbetween lines

    System.out.println("Wow, you chose " + firstNumber + " and " + secondNumber + "? Typical.");
    //Add the Possible Calculations print lines
    System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

    //Add the math function type prompt and add a Scanner
    System.out.print ("Please select an option, no answer is a bad answer!: ");
    String mathFunction = scan.nextLine();

    //Add "if" and  "else if" statements to create outputs for +,-,*,/
    if (mathFunction.equals("A")) {
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    } else if (mathFunction.equals("S")) {
        System.out.println(firstNumber + " - " +secondNumber + " = " + (firstNumber - secondNumber));
    } else if (mathFunction.equals("M")) {
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
    } else if (mathFunction.equals("D")) {
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    } else
        System.out.println("You chose the worst possible response. [ YOU DIED ]");





    }
}

