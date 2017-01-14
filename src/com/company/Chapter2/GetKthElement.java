package com.company.Chapter2;

public class GetKthElement
{
    public Node<String> GetKthElement(int index, Node<String> list)
    {
        if (index == 0) return list;

        int count = 0;
        Node<String> current = list;
        while(count != index)
        {
            if(current == null) return null;
            current = current.getNext();
            count++;
        }

        return current;
    }
}
