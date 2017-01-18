package com.company.Chapter2;


import java.util.HashSet;

public class LoopDetector
{
    public Node<String> DetectLoop(Node<String> list)
    {
        HashSet<Node<String>> set = new HashSet<>();
        Node<String> runner = list;

        while(runner != null)
        {
            if (set.contains(runner))
            {
                return runner;
            }
            set.add(runner);
            runner = runner.getNext();
        }

        return null;
    }
}
