import static java.lang.System.*;

public class Objective6Lab3{
  public static void main(String[] args){
    int counter =0, div;

    while (counter < 20){
      counter= counter+1;

      if (counter%2==0){
        out.println(counter+" is even");
      }

      else if (counter%2==1){
        out.println(counter+" is odd");
      }

    }

  }
}
