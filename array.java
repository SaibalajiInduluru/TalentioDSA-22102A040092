import java.util.*;
class array{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[a];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i]=arr[i]+arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        
    }
}