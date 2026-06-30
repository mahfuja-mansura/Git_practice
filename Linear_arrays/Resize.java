public class Resize 
{
    public static void main(String[]args)
    {
        int[]prev_arr = {1,2,3,4,5};
        int[]new_arr = new int [8];

        for(int i = 0; i < prev_arr.length; i++)
        {
            new_arr[i] = prev_arr[i];
        }
        for(int i = prev_arr.length; i<new_arr.length; i++)
        {
            new_arr[i] = i + 1;
        }
        Required_methods rm = new Required_methods();
        rm.print_arr_int(new_arr, "hor");
    }
}
