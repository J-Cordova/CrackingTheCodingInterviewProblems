package Chapter2_Tests;

import com.company.Chapter2.DeleteMiddleNode;
import com.company.Chapter2.Node;
import org.junit.Assert;
import org.junit.Test;

public class DeleteMiddleNode_Tests
{
    @Test
    public void GivenListWithMiddle_DeleteMiddleNode_MiddleNodeDelete()
    {
        DeleteMiddleNode deleter = new DeleteMiddleNode();

        Node<String> list = TestListGenerator.getTestLinkedList();

        Node<String> result = deleter.DeleteMiddleNode(list);

        Assert.assertTrue(result.getNext().getData() == TestListGenerator.getTestLinkedList().getNext().getNext().getData());
    }
}
