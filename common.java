import java.util.*;
public class common 
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        int[] arr1={3,4,5,6};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {   
                if(arr[i]==arr1[j])
                {
                    System.out.println(arr[i]);
                }

            }
        }
    }
    
}
