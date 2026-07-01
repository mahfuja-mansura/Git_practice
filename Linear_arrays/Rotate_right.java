public class Rotate_right
{
    public static void main(String[]args)
    {
        int[]arr = {1,2,3,4,5};
        int temp = arr[arr.length-1];

        for(int i = arr.length-1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
        Required_methods rm = new Required_methods();
        rm.print_arr_int(arr, "hor");
    }    
}
