import java.util.*;
public class doublylinkedlist 
{
    
class Node
{
    int data;
    Node next;
    Node prev;

Node(int data)
{
    this.data=data;
    this.next=null;
    this.prev=null;
}
}
Node head=null;
Node tail=null;
public void insertend(int data)
{
    Node newNode=new Node(data);
    if(head==null)
    {
        head=tail=null;
    }
    else
    {
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
}
public void insertbeng(int data)
{
    Node newNode=new Node(data);
    if(head==null)
    {
        head=tail=newNode;
    }
    else
    {
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
}
public void displayforward()
{
    Node temp=head;
    System.out.println("Forward list");
    while(temp!=null)
    {
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
}
public void displaybackward()
{
    Node temp=tail;
    System.out.println("backward list");
    while (temp!=null) 
    {
        System.out.println(temp.data+" ");
        temp=temp.prev;
    }
}
public static void main(String[] args) 
{
    doublylinkedlist dl=new doublylinkedlist();
    dl.insertbeng(12);
    dl.insertbeng(34);
    dl.insertbeng(45);
    dl.insertend(23);
    dl.insertend(32);
    dl.displayforward();
    dl.displaybackward();
    
}
}
