package com.company.Chapter3;


public class StackNode<T>
{
    private T data = null;
    private StackNode<T> next = null;
    private StackNode<T> previous = null;

    public StackNode()
    {}

    public StackNode(T data)
    {
        this.data = data;
    }

    public StackNode(T data, StackNode<T> next, StackNode<T> previous)
    {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public StackNode<T> getNext()
    {
        return next;
    }

    public void setNext(StackNode<T> next)
    {
        this.next = next;
    }

    public StackNode<T> getPrevious()
    {
        return previous;
    }

    public void setPrevious(StackNode<T> previous)
    {
        this.previous = previous;
    }
}
