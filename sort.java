
import java.util.*;
public class sort 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean sorted=true;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                sorted=false;
            }
        }
        if(sorted)
        {
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}
