import java.util.*;
    class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class linkedlist 
{
    Node head;
    linkedlist()
    {
        this.head=null;//optional head is null by deafult
    }
     void insertfirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
    }
    void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    Node findlast()
    {
        if(head==null)
        {
            return null;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        return temp;
    }
    void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insert(10);
        list.print();
        list.insert(20);
        list.insert(30);
        list.print();
    }
}
