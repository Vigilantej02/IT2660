public class LinkedList
{  //variable that shows the first node in the list
   private Node root;
   //variable that shows the last node in the list
   private Node last;
   //variable that holds how big the list is, used later to increase/decrease the size
   private int size;
   
   //constructor that takes 1 node as parameter
   //figure I should initialize something in this list
   //rather than try to initialize an empty list
   //dunno why but that feels like a bad idea
   LinkedList(Node n)
   {
      root = n;
      last = n;
      size = 1;
   }
   //my append method. I use this to add a node to the list,
   //but not at a specific location.
   public void append(Node n)
   {   //using the variable 'last' as the object of the method, 
       //sets the next node to the one given when the method is called.
       last.setNextNode(n);
       //sets the last node in the list as the node given
       last = n;
       //dynamically changes the size of the list to increase the size to
       //account for anothe node
       size = size + 1;
   }
   //man that second edge case you gave us was a nightmare to figure out.
   //decided on an if-else statement.
   //one day I'll learn how to properly implement switch statements.
   //needed this method to do it.
   public void insertNewRoot(Node n)
   {   //so this methods body looks a lot like the append method, right?
       //wrong. does something totally different.
       //The line below invokes the setNextNode() method of the Node class
       //using the given node as the object it acts on, and the current root
       //as the parameter of said method.
       n.setNextNode(root);
       //says "Hey, make the root the node you gave"
       root = n;
       //increase the size of the list by one.
       size = size + 1;
   }
   //final method i wrote for the insertNodeAtPosition() if else statement.
   public void insertAt(Node n, int i)
   {   //set the next node after you get it, apply it to n
       n.setNextNode(n.getNextNode());
       //increase size by one
       size = size + 1;
   }
   public void insertNodeAtPosition(Node n, int position)
   {   //if the root is the same as the node given, insert it as
       //a new root
       if(root == n)
       {
           insertNewRoot(n);
       }
       //where the position given is greater than the size of the list,
       //use the append method
       else if (position > size)
       {
           append(n);
       }
       //finally, if neither statements are true, insert the node
       //using the given position.
       else
       {
           insertAt(n, position);
       }
   }
   //This is my issue. Why can't you access this? 
   //the getValue() method is public. Whats the deal?
   public void display()
   {
       for (int count = 0; count < size; count++)
       {
           System.out.println(getValue());
       }
   }
}
