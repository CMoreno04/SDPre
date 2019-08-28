import static java.lang.System.*;
import  java.util.Scanner;

public class Objective5Lab1{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int month = 6;

    switch(month) {
      case 1:
        out.println("January");
        break;
      case 2:
        out.println("February");
        break;
      case 3:
        out.println("March");
        break;
      case 4:
        out.println("April");
        break;
      case 5:
        out.println("May");
        break;
      case 6:
        out.println("June");
        break;
      case 7:
        out.println("January");
        break;
      case 8:
        out.println("February");
        break;
      case 9:
        out.println("March");
        break;
      case 10:
        out.println("April");
        break;
      case 11:
        out.println("May");
        break;
      case 12:
        out.println("June");
        break;

      default:
      out.println("That is not a valid entry");
      break;

    }
  }
}
