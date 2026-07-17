package Stack;

public class Stack
{
    Node top = null;
    
    public Stack()
    {
        top = null;
    }

    public void push(int elem)
    {
        Node newNode = new Node(elem, null);
        if(top==null)
        {
            top = newNode;
        }
        else
        {
            newNode.next = top;
            top = newNode;
        }
    }

    public Node pop()
    {
        if(isEmpty())
        {
            return null;
        }
        Node removed = top;
        top = top.next;
        return removed;
    }

    public Node peek()
    {
        if(isEmpty())
        {
            return null;
        }
        return top;
    }

    public boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        return false;
    }
    
}
