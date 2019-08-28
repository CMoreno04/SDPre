import static java.lang.System.*;
import java.util.Scanner;

public class DictionaryOrder {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    String name, name1;

    out.print("Make up the name of a programming language!");
    name1 = keyboard.nextLine();
    name = name1.toLowerCase();

    if ( name.compareTo("c++")< 0)
      out.println(name+" comes BEFORE c++");
    if ( name.compareTo("c++")== 0)
      out.println("c++ isn't a made-up language!");
    if ( name.compareTo("c++") > 0)
      out.println(name+ " comes After c++");

    if ( name.compareTo("go")< 0)
      out.println( name+" come BEFORE go");
    if ( name.compareTo("go") == 0)
      out.println( "go isn't a made-up language!");
    if ( name.compareTo("go") > 0)
      out.println( name+" comes AFTER go");

    if ( name.compareTo("java")< 0)
      out.println( name+" come BEFORE java");
    if ( name.compareTo("java") == 0)
      out.println( "java isn't a made-up language!");
    if ( name.compareTo("java") > 0)
      out.println( name+" comes AFTER java");

    if ( name.compareTo("lisp")< 0)
      out.println( name+" come BEFORE lisp");
    if ( name.compareTo("lisp") == 0)
      out.println( "lisp isn't a made-up language!");
    if ( name.compareTo("lisp") > 0)
      out.println( name+" comes AFTER lisp");

    if ( name.compareTo("python")< 0)
      out.println( name+" come BEFORE python");
    if ( name.compareTo("python") == 0)
      out.println( "python isn't a made-up language!");
    if ( name.compareTo("go") > 0)
      out.println( name+" comes AFTER python");

    if ( name.compareTo("ruby")< 0)
      out.println( name+" come BEFORE ruby");
    if ( name.compareTo("ruby") == 0)
      out.println( "ruby isn't a made-up language!");
    if ( name.compareTo("ruby") > 0)
      out.println( name+" comes AFTER go");

    if ( name.compareTo("visualbasic")< 0)
      out.println( name+" come BEFORE visualbasic");
    if ( name.compareTo("visualbasic") == 0)
      out.println( "visualbasic isn't a made-up language!");
    if ( name.compareTo("go") > 0)
      out.println( name+" comes AFTER visualbasic");


  }
}
