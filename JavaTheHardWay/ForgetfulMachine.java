import java.util.Scanner;

public class ForgetfulMachine{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What city is the capital of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();
    //The 2nd question blows up when I type any decimal number.

    System.out.println("Enter a number between 0.0 and 1.0.");
    keyboard.nextDouble();
    // The value 2.3.2 blew it up, is not a decimal number, but either an integer.

    System.out.println("Is there anything else you would like to say?");
    keyboard.next();
  }
}
