import java.util.*;
public class duplicate
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        //int[] arr1=new int[n];
        //int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    //arr1[k]=arr[i];
                    //k++;
                    System.out.println(arr[i]);
                }
            }
        }
        //for(int i=0;i<n;i++)
        //{
             //System.out.println(arr1[i]);
        //}
       

    }
}
