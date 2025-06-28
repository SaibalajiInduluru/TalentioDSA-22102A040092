import java.util.*;
public class sortlength 
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String[] arr=new String[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.next();
            }
            int count=0;
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-i-1;j++)

                    if(arr[j].length()>arr[j+1].length())
                    {
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
            
            }
                
            for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            }
        }
    }
     

    

