package Chapter2_Tests;


import com.company.Chapter2.LoopDetector;
import com.company.Chapter2.Node;
import org.junit.Assert;
import org.junit.Test;

public class LoopDetector_Tests
{
    @Test
    public void GivenLoopedList_DetectLoop_ReturnsLoopedNode()
    {
        Node<String> list = GetLoopedList();

        LoopDetector detector = new LoopDetector();

        Node<String> result = detector.DetectLoop(list);

        Assert.assertTrue(result != null);
        Assert.assertTrue(result.getData() == "head");
    }

    @Test
    public void GivenNonLoopedList_DetectLoop_ReturnsNull()
    {
        Node<String> list = GetNonLoopedList();

        LoopDetector detector = new LoopDetector();

        Node<String> result = detector.DetectLoop(list);

        Assert.assertTrue(result == null);
    }

    private Node<String> GetLoopedList()
    {
        Node<String> head = new Node<>("head", null);

        head.setNext(new Node<String>("second", new Node("looper", head)));

        return head;
    }

    private Node<String> GetNonLoopedList()
    {
        return new Node<String>("Hello",new Node<String>("again", new Node<String>("final")));
    }
}


