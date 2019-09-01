import static java.lang.System.*;

public class Objective6Lab4{
  public static void main(String[] args){
  int count=21;
  int sum=0;

    do {
      count=count-1;
      sum=sum+count;
    }while (count > 0);

    out.println(sum);

  }
}
