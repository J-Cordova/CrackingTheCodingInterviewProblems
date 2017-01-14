package com.company.Chapter2;


public class DeleteMiddleNode
{
    public Node<String> DeleteMiddleNode(Node<String> node)
    {
        if (node == null || node.getNext() == null ) return null;

        node.setNext(node.getNext().getNext());

        return node;
    }
}
