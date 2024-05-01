import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.print.outln("Enter your height: ");
    double height = in.nextDouble();

    System.print.outln("Enter your weight: ");
    double weight = in.nextDouble();

    double bmi = weight / (height * height)

    System.print.outln("Your bmi is: " + bmi);
  }
}
