import java.util.*;
public class Required_methods
{
     Scanner input = new Scanner(System.in);
    //Method 1
    public void iteration(int[]arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
    } 



    //Method 2
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
        System.out.println(" ");
    }



    //Method 3
    public void resize(int[]arr, int extn)
    {
        int[]new_arr = new int[arr.length+extn];

        for(int i = 0; i < arr.length; i++)
        {
            new_arr[i] = arr[i];
        }

        for(int i = arr.length; i<new_arr.length; i++)
        {
            new_arr[i] = input.nextInt();
        }

        print_arr_int(new_arr, "hor");

    }



    //Method 4
    public void rotate(int[]arr, String direction)
    {
        int temp = 0;

        if(direction.equals("left"))
        {
            temp = arr[0];
            
            for(int i = 0; i < arr.length-1; i++)
            {
                arr[i] = arr[i+1];
            }
       
            arr[arr.length-1] = temp;
        }

        else if(direction.equals("right"))
        {
            temp = arr[arr.length-1];

            for(int i = arr.length-1; i > 0; i--)
            {
                arr[i] = arr[i-1];
            }

            arr[0] = temp;
        }

        print_arr_int(arr, "hor");
    }



    //Method 5
    public void shift(int[]arr, String direction)
    {
       if(direction.equals("left"))
        {
            for(int i = 1; i < arr.length; i++)
            {
                arr[i-1] = arr[i];
            }
       
            arr[arr.length-1] = 0;
        }

        else if(direction.equals("right"))
        {
            for(int i = arr.length-1; i > 0; i--)
            {
                arr[i] = arr[i-1];
            }

            arr[0] = 0;
        }

        print_arr_int(arr, "hor"); 
    }



    //Method 6
    public void reverse_op(int[]arr)
    {
        int[]new_arr = new int [arr.length];
    
        for(int i = 0; i < arr.length; i++)
        {
            new_arr[i] = arr[i];
        }

        print_arr_int(new_arr, "hor");
    }



    //Method 7
    public void reverse_ip(int[]arr)
    {
       int temp = 0;
        
        for(int i = 0; i < arr.length/2; i++)
        {
            temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
 
        print_arr_int(arr, "hor");
    }



    //Method 8
    public void insert(int[]arr, int indx, int value)
    {
        int[]new_arr = new int [arr.length+1];
        new_arr[indx] = value;
        
        for(int i = 0; i < indx; i++)
        {
            new_arr[i] = arr[i];
        }

        for(int i = new_arr.length-1; i>indx; i--)
        {
            new_arr[i] = arr[i-1];
        }
        print_arr_int(new_arr, "hor");
    }
}
