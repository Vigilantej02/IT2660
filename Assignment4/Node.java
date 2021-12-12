public class Node
{   //variables needed. the string to store the data, the node variable
    // to point to the next node in the list
    public String value;
    private Node nextNode;
    //constructor that takes a String and assigns it to value.
    //I use this to instantiate my node objects and add them to the
    //list
    Node(String s)
    {
        value = s;
    }
    //method that returns the value of the node
    public String getValue()
    {
        return this.value;
    }
    //method that indicates what the next node is
    public Node getNextNode()
    {
        return this.nextNode;
    }
    //method that sets the next node, linking them.
    public void setNextNode(Node n)
    {
        this.nextNode = n;
    }
    public void displayNode(Node n)
    {
        System.out.println(n.value);
    }
}
