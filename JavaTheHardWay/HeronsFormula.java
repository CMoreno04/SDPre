import static java.lang.System.*;

public class HeronsFormula{
  public static void main(String[] args){
    double a, g;
    String tws = "A triangles with sides";

    a = triangleArea(3, 3 ,3);
    out.println("A triangles with sides 3,3,3 has sides "+a);

    a = triangleArea(3, 4, 5);
    out.println("A triangles with sides 3,4,5 has area  "+a);

    g = triangleArea(3, 3 ,3);
    out.println(tws+" 7,8,9 has area "+g);

    out.println(tws+"5,12,13 has area "+triangleArea(5,12,13));
    out.println(tws+"10,9,11 has area "+triangleArea(10,9,11));
    out.println(tws+"8,15,17 has area "+triangleArea(8,15,17));
    out.println(tws+"9,9,9 has area "+triangleArea(9,9,9));
  }
  public static double triangleArea(double a, double b, double c){
    double s,A;

    s=(a+b+c)/2.0;
    A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return A;
  }
}//1. one without function is the longest
//2. Change to double. not that hard, change the int to double in the declaration.
//3.Not that hard, just add another computing area lines with the new values. 
