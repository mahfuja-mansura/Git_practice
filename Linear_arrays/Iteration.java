public class Iteration
{
    public static void main(String[]args)
    {
        int[]arr = new int [5];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i + (i+1);
        }
        Required_methods rm = new Required_methods();
        rm.print_arr_int(arr, "hor");
    }
}