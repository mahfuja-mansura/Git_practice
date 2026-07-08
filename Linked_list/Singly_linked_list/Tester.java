package Linked_list.Singly_linked_list;

public class Tester
{
    public static void main(String[]args)
    {
        int[]arr = {1,2,3,4,5};
        Node head = Required_methods.createList(arr);
        Required_methods.printList(head);
        int length = Required_methods.countNodes(head);
        System.out.println("Length of this linked list is " + length);
        System.out.println(Required_methods.elemAt(head, 3));
        Required_methods.valueUpdate(head, 2, 100);
        Required_methods.printList(head);
        System.out.println(Required_methods.valueSearch(head, 2));
        Required_methods.Insert(head, 5, 101);
        Required_methods.printList(head);
        Required_methods.remove(head, 3);
        Required_methods.printList(head);
    }    
}
