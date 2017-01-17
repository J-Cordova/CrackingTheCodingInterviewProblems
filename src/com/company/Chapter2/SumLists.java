package com.company.Chapter2;


public class SumLists
{
    public int sumLists(Node<String> list1, Node<String> list2)
    {
        Node<String> runner1 = list1;
        Node<String> runner2 = list2;

        StringBuilder list1str = new StringBuilder();
        StringBuilder list2str = new StringBuilder();

        while(runner1 != null || runner1 != null)
        {
            if(runner1 != null)
            {
                list1str.append(runner1.getData());
                runner1 = runner1.getNext();
            }
            if(runner2 != null)
            {
                list2str.append(runner2.getData());
                runner2 = runner2.getNext();
            }
        }

        return Integer.parseInt(list1str.toString()) + Integer.parseInt(list2str.toString());
    }
}
