import java.util.*;
public class even 
{
    public static void main(String []args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int evencount=0;
    int oddcount=0;
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        if(arr[i]%2==0)
        {
           evencount++; 
        }
        else{
            oddcount++;
        }
    }
    System.out.println(evencount);
    System.out.println(oddcount);
   }
}
