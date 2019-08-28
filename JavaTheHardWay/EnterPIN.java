import static java.lang.System.*;
import java.util.Scanner;

public class EnterPIN{
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String pass;

    pin = 12345;

    out.println("WELCOME TO THE BANK OF JAVA.");

    out.println("ENTER YOUR PASSWORD: ");
      pass = keyboard.next();

    while (!pass.equals("please")){
      out.println("WRONG PASSWORD, TRY AGAIN");
      pass = keyboard.next();
    }

      out.println("Enter your PIN: ");
      entry = keyboard.nextInt();

    while(entry != pin){
      out.println("INCORRECT PIN, TRY AGAIN!");
      entry = keyboard.nextInt();
    }
      out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
