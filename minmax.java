import java.util.*;
class minmax
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int  min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<min)
            {
                min=arr[i];
            }
            else{
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}