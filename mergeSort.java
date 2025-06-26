import java.util.*;
public class mergeSort 
{
    static void mergesort(int []arr,int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    private static void merge(int []arr,int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int []leftarray=new int[n1];
        int []rightarray=new int[n2];
        for(int i=0;i<n1;i++)
        {
            leftarray[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++)
        {
            rightarray[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1&&j<n2)
        {
            if(leftarray[i]<=rightarray[j])
            {
                arr[k]=leftarray[i];
                i++;
            }
            else
            {
                arr[k]=rightarray[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=leftarray[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=rightarray[j];
            j++;
            k++;
        }
        
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,n-1);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
    
}
