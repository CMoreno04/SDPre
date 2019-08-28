import static java.lang.System.*;
import java.util.Scanner;

public class HighLow{
  public static void main (String[] args){
    Scanner key = new Scanner(System.in);
    int secret, guess;

    secret = 1+(int)(100*Math.random());

    out.println("I'm thinking of a number between 1-100.");
    out.println("Try to guess it!");
    out.print("> ");
    guess = key.nextInt();

    while (secret != guess){
      if( guess < secret){
        out.println("Sorry, your guess is to Low.");
      }

      if( guess > secret){
        out.println("Sorry, your guess is to High.");
      }
      out.println("Try again: ");
      guess = key.nextInt();
    }

    out.println(" You guessed it! What are the odds?!?");
  }
}
