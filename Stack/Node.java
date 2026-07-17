package Stack;

public class Node
{
    int elem;
    Node next;
    
    public Node()
    {
        elem = 0;
        next = null;
    }
    public Node (int elem, Node next)
    {
        this.elem = elem;
        this.next = next;
    }
}
