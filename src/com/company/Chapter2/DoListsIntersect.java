package com.company.Chapter2;


import java.util.HashSet;

public class DoListsIntersect
{
    public boolean doListsIntersect(Node<String> list1, Node<String> list2)
    {
        HashSet<Node<String>> set = new HashSet<>();
        Node<String> runner = list1;

        boolean doesIntersect = false;

        while(runner != null)
        {
            set.add(runner);
            runner = runner.getNext();
        }

        runner = list2;
        while(runner != null)
        {
            if (set.contains(runner))
            {
                doesIntersect = true;
                break;
            }
            runner = runner.getNext();
        }
        return doesIntersect;
    }

    public boolean doListsIntersectConstantSpace(Node<String> list1, Node<String> list2)
    {
        Node<String> runner = list1;
        Node<String> runner2 = list2;


        while(runner.getNext() != null)
        {
            runner = runner.getNext();
        }

        while(runner2.getNext() != null)
        {
            runner2 = runner2.getNext();
        }

        return runner == runner2;
    }
}
