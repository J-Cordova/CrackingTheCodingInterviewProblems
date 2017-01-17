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


    public static Node<Integer> getIntegerTestLinkedList()
    {
        Node<Integer> node = new Node<>(5);

        node.setNext(new Node<Integer>(2));
        node.getNext().setNext(new Node<Integer>(3));
        node.getNext().getNext().setNext(new Node<Integer>(6));

        return node;
    }

    public static Node<String> getTestStringIntegerList()
    {
        Node<String> node = new Node<>("2");

        node.setNext(new Node<String>("2"));
        node.getNext().setNext(new Node<String>("2"));
        node.getNext().getNext().setNext(new Node<>("2"));

        return node;
    }

    public static Node<String> getTestStringIntegerList2()
    {
        Node<String> node = new Node<>("4");

        node.setNext(new Node<String>("4"));
        node.getNext().setNext(new Node<String>("4"));
        node.getNext().getNext().setNext(new Node<>("4"));

        return node;
    }
}
