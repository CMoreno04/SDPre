import static java.lang.System.*;
import java.util.Scanner;

public class ShapeArea{
  public static void main(String[] args){
    Scanner key=new Scanner(System.in);
    int choice;
    double area=0;

    out.print("Shape Area CAlculator Version 1.0");
    out.print("(c) 2015 LJtHW Sample Output, Inc.");

    do {
      out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
      out.println("1) Triangle");
      out.println("2) Circle");
      out.println("3) Rectangle");
      out.println("4) Square");
      out.println("5) Quit");
      out.print("> ");
      choice =key.nextInt();

      if(choice==1){
        out.print("\nBase: ");
        int b = key.nextInt();
        out.print("\nHeight: ");
        int h = key.nextInt();
        area = computeTriangleArea(b,h);
        out.println("The area is "+area);
      }
      else if(choice==2){
        out.print("\nRadius: ");
        int radius=key.nextInt();
        area=computeCircleArea(radius);
        out.println("The area is "+area);
      }
      if(choice==3){
        out.print("\nLength: ");
        int q = key.nextInt();
        out.print("\nWidth: ");
        int w = key.nextInt();
        out.println("The area is "+computeRectangleArea(q,w));
      }
      else if(choice==4){
        out.print("\nSide: ");
        int side=key.nextInt();
        area=computeSquareArea(side);
        out.println("The area is "+area);
      }
      else if (choice != 5){
        out.println("ERROR.");
      }

    }while (choice != 5);

  }

  public static double computeTriangleArea(int base, int height){
    double A;
    A= 0.5*base*height;
    return A;
  }

  public static double computeCircleArea( int radius){
    double A;
    A=Math.PI*(radius*radius);
    return A;
  }

  public static int computeRectangleArea(int length, int width){
    return(length*width);
  }

  public static double computeSquareArea(int side){
    double A;
    A=4*side;
    return A;
  }
}
