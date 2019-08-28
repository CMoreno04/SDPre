import static java.lang.System.*;
import java.util.Scanner;

public class ThereAndBackAgain{
  public static void main(String[] args){
    out.println("Here.");
    erebor();
    out.println("Back first time.");
    erebor();
    out.println("Back second time.");
  }

  public static void erebor(){
  out.println("There.");
  }
}
//1.won't compile.
//2.it compiles.
