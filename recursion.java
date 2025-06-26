import java.util.*;
public class recursion 
{
    static void divide(int n)
    {
        System.out.println(n);//here it prints the value of n;
        if(n>0)//conditon checking whether the n is greater than 0 or not 
        {
            divide(n/2);//now dividing the n in to half using the function
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        divide(n);
    }
}
