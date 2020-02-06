public class MyRecursionClass
{
    public static void main(String args[])
    {
        counting(3);
    }//end driver with a call to a recursive method

    public static void counting(int num)
    {
        if (num > 0)
        {
            counting(num-1); //this is recursive call
        }//end if to get to base case

        switch(num)
        {
            case 1: //enacts when num contains 1
                System.out.println("One");
                break;
            case 2: //enacts when num contains 2
                System.out.println("Two");
                break;
            case 3: //enacts when num contains 3
                System.out.println("Three");
                break;
        }//end switch block
    }//recursive method with switch/case
}//end Recursion class
