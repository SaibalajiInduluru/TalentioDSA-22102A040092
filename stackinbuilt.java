import java.util.Stack;
public class stackinbuilt
{
    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(30);
        stack.push(40);stack.push(50);
        stack.push(40);
        System.out.println("Stack Elements:"+stack);
        System.out.println("popped element"+stack.pop());
        System.out.println("Peek element"+stack.peek());
        System.out.println("element"+stack.search(40));
        System.out.println(stack.isEmpty());

    }
    
}
