public class Required_methods
{
    public void print_arr_int(int arr[], String axis)
    {
        if(axis.equals("hor"))
        {
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
        else if(axis.equals("ver"))
        {
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
