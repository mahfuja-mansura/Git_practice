public class Shift_left 
{
    public static void main(String[]args)
    {
       int[]arr = {1,2,3,4,5};

        for(int i = 1; i < arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;

        Required_methods rm = new Required_methods();
        rm.print_arr_int(arr,"hor");
    }
}
