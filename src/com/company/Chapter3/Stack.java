package com.company.Chapter3;


public class Stack<T>
{
    StackNode<T> stack = null;
    int count = 0;

    public void push(T data)
    {
        if (stack == null)
        {
            stack = new StackNode<T>(data);
        }
        else
        {
            StackNode<T> next = new StackNode<T>(data);
            next.setPrevious(stack);
            stack.setNext(next);
            stack = stack.getNext();
        }
        count++;
    }

    public T pop()
    {
        if (count == 0)
        {
           return null;
        }

        T data = stack.getData();

        stack = stack.getPrevious();
        stack.setNext(null);

        count--;
        return data;
    }

    public T peek()
    {
        return stack.getData();
    }

    public int getSize()
    {
        return count;
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

}
