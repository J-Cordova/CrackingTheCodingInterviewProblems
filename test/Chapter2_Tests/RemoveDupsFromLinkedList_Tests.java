package Chapter2_Tests;

import com.company.Chapter2.LinkedList;
import com.company.Chapter2.Node;
import com.company.Chapter2.RemoveDupsFromLinkedList;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class RemoveDupsFromLinkedList_Tests
{
    @Test
    public void GivenListWithDuplicates_RemoveDupsFromLinkedList_ReturnUniqueLinkedList()
    {
        Node<String> list = TestListGenerator.getTestLinkedList();
        RemoveDupsFromLinkedList remover = new RemoveDupsFromLinkedList();

        list = remover.RemoveDuplicates(list);

        Boolean result = true;

        HashSet<String> set = new HashSet<String>();
        while(list != null)
        {
            if (set.contains(list.getData()))
            {
                result = false;
                break;
            }
            else
            {
                set.add(list.getData());
                list = list.getNext();
            }
        }

        Assert.assertTrue(result);
    }

    @Test
    public void GivenListWithDuplicates_RemoveDupsFromLinkedListConstantSpace_ReturnUniqueLinkedList()
    {
        Node<String> list = TestListGenerator.getTestLinkedList();
        RemoveDupsFromLinkedList remover = new RemoveDupsFromLinkedList();

        list = remover.RemoveDuplicatesWithConstantSpace(list);

        Boolean result = true;

        HashSet<String> set = new HashSet<String>();
        while(list != null)
        {
            if (set.contains(list.getData()))
            {
                result = false;
                break;
            }
            else
            {
                set.add(list.getData());
                list = list.getNext();
            }
        }

        Assert.assertTrue(result);
    }


}
