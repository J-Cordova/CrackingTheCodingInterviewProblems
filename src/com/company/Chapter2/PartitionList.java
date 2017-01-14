package com.company.Chapter2;


public class PartitionList
{
    public Node<Integer> ParitionList(Node<Integer> list, int partitionNum)
    {
        Node<Integer> originalLessThan = null;
        Node<Integer> lessThan = null;

        Node<Integer> originalEqualOrGreaterThan = null;
        Node<Integer> equalOrGreaterThan = null;


        Node<Integer> current = list;

        while(current != null)
        {
            if (current.getData() < partitionNum)
            {
                if (lessThan == null)
                {
                    lessThan = new Node<>(current.getData());
                    originalLessThan = lessThan;
                }
                else
                {
                    lessThan.setNext(new Node<>(current.getData()));
                    lessThan = lessThan.getNext();
                }
            }
            else
            {
                if (equalOrGreaterThan == null)
                {
                    equalOrGreaterThan = new Node<>(current.getData());
                    originalEqualOrGreaterThan = equalOrGreaterThan;
                }
                else
                {
                    equalOrGreaterThan.setNext(new Node<>(current.getData()));
                    equalOrGreaterThan = equalOrGreaterThan.getNext();
                }
            }

            current = current.getNext();
        }

        lessThan.setNext(originalEqualOrGreaterThan);
        return originalLessThan;
    }
}
