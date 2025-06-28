import java.util.*;
public class countupper 
{
    public static void main(String[] args)
    {
        String str="Hello World";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>65&&str.charAt(i)<90)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
