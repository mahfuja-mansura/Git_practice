package Stack;

public class Tester 
{
    public static void main(String[]args)
    {
        Stack st = new Stack();

        for(int i = 0; i < 5; i++)
        {
            st.push(i);
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println(st.pop().elem);
        }
    }    
}
