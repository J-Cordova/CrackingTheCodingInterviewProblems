package Chapter2_Tests;

import com.company.Chapter2.GetKthElement;
import com.company.Chapter2.Node;
import org.junit.Assert;
import org.junit.Test;

public class GetKthElement_Tests
{
    @Test
    public void GivenIndex_GetKthElement_ReturnsKthElement()
    {
        Node<String> list = getTestLinkedList();

        GetKthElement get = new GetKthElement();

        Node<String> result = get.GetKthElement(2,list);
        Node<String> result2 = get.GetKthElement(1,list);
        Node<String> result3 = get.GetKthElement(0,list);
        Node<String> result4 = get.GetKthElement(9,list);

        Assert.assertTrue(result.getData() == "c");
        Assert.assertTrue(result2.getData() == "b");
        Assert.assertTrue(result3.getData() == "a");
        Assert.assertTrue(result4 == null);
    }

    private Node<String> getTestLinkedList()
    {
        Node<String> node = new Node<>("a");

        node.setNext(new Node<String>("b"));
        node.getNext().setNext(new Node<String>("c"));
        node.getNext().getNext().setNext(new Node<>("b"));

        return node;
    }
}
