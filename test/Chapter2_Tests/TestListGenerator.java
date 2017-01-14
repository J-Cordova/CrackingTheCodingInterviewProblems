package Chapter2_Tests;

import com.company.Chapter2.Node;

public class TestListGenerator
{
    public static Node<String> getTestLinkedList()
    {
        Node<String> node = new Node<>("a");

        node.setNext(new Node<String>("b"));
        node.getNext().setNext(new Node<String>("c"));
        node.getNext().getNext().setNext(new Node<>("b"));

        return node;
    }

}
