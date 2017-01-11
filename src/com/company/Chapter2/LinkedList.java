package com.company.Chapter2;


public class LinkedList<T>
{
    private Node<T> head = null;

    public LinkedList()
    {
    }

    public LinkedList(Node<T> node)
    {
        head = node;
    }

    public Node getHead()
    {
        return head;
    }

    public void setHead(Node head)
    {
        this.head = head;
    }

    public void Add(Node node)
    {
        Node current = head;
        if (current == null)
        {
            current = node;
            return;
        }

        while(current.getNext() != null)
        {
            current = current.getNext();
        }

        current.setNext(node);
    }
}
