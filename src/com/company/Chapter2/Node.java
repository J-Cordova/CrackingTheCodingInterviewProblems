package com.company.Chapter2;


public class Node<T>
{
    private Node next = null;
    private T data = null;

    public Node()
    {

    }

    public Node(T cdata)
    {
        data = cdata;
    }

    public Node(T cdata, Node node)
    {
        data = cdata;
        next = node;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
