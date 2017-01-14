package Chapter2_Tests;


import com.company.Chapter2.Node;
import com.company.Chapter2.PartitionList;
import org.junit.Assert;
import org.junit.Test;

public class PartitionList_Tests
{
    @Test
    public void GivenList_PartitionList_ReturnsPartitionedList()
    {
        Node<Integer> list = TestListGenerator.getIntegerTestLinkedList();
        int partitionNumber = 4;

        PartitionList partition = new PartitionList();
        Node<Integer> result = partition.ParitionList(list,partitionNumber);

        Node<Integer> current = result;

        Assert.assertTrue(current.getData() == 2);
        current = current.getNext();
        Assert.assertTrue(current.getData() == 3);
        current = current.getNext();
        Assert.assertTrue(current.getData() == 5);
        current = current.getNext();
        Assert.assertTrue(current.getData() == 6);
    }
}
