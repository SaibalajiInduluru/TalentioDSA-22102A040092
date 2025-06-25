public class maxsubarray 
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,2,5,1,2,4};
        int k=3;
        int maxsum=0;
        for(int i=0;i<arr.length-3;i++)
        {
                int sum=arr[i]+arr[i+1]+arr[i+2];
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
        }

     
        System.out.println(maxsum);
    }
}
