import java.util.*; //wildcards ftw
import java.io.*;
public class Main
{ 
  public static void main(String[] args)
  { //creating my objects
      Character c1 = new Character();
      Character c2 = new Character("Heihachi Mishima", 64);
      Character c3 = new Character("Kazuya Mishima", 42);
      Character c4 = new Character("Jin Mishima", 23);
      /*System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      System.out.println(c4);
      these were just used to test my toString override method.
      */
     //finally figured it out. Like most of my problems in life,
     //i was way over complicating it by thinking I was making it easier
     //on myself. 
     //creating a stack of character objects
      Stack<Character> s = new Stack<Character>();
      //pushing all those characters onto the stack
      s.push(c2);
      s.push(c1);
      s.push(c3);
      s.push(c4);
      s.push(c3);
      s.push(c1);
      //this line below outputs what chracters are in the stack, using my overriden toString() method
      System.out.println("The stack consists of: " + s + "\n");
      System.out.println("Popping an element out of the stack.");
      System.out.println("This element that was popped out was: ");
      //Thanks tutorialspoint for helping me figure out how to do this.
      Character characterThatGotPopped = (Character) s.pop();
      System.out.println(characterThatGotPopped);
      //as you can see, you can do this forever. Add as many characters as you want. Pop as many you need.
  }
}
