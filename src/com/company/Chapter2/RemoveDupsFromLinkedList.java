package com.company.Chapter2;


import java.util.HashSet;

public class RemoveDupsFromLinkedList
{
    public Node<String> RemoveDuplicates(Node<String> list)
    {
        HashSet<String> set = new HashSet<String>();
        Node<String> current = list;

        while(current.getNext() != null)
        {
            if (set.contains(current.getNext().getData()))
            {
                current.setNext(current.getNext().getNext());
            }
            else
            {
                set.add(current.getData());
                current = current.getNext();
            }

        }

        return list;
    }

    public Node<String> RemoveDuplicatesWithConstantSpace(Node<String> list)
    {
        Node<String> counter = list;
        if (list == null)
        {
            return list;
        }

        Node<String> current = counter;

        while(counter != null)
        {
            while (current.getNext() != null)
            {
                if (current.getNext().getData() == counter.getData())
                {
                    current.setNext(current.getNext().getNext());
                }
                else
                {
                    current = current.getNext();
                }
            }
            counter = counter.getNext();
            current = counter;
        }

        return list;
    }

    private LinkedList getTestLinkedList()
    {
        Node<String> node = new Node<>("a");

        node.setNext(new Node<String>("b"));
        node.getNext().setNext(new Node<String>("c"));
        node.getNext().getNext().setNext(new Node<>("b"));

        return new LinkedList<String>(node);
    }
}
