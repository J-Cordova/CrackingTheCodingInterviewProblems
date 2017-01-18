package Chapter2_Tests;


import com.company.Chapter2.DoListsIntersect;
import com.company.Chapter2.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DoListsIntersect_Tests
{
    @Test
    public void GivenIntersectingList_DoListsIntersect_ReturnsTrue()
    {
        ArrayList<Node<String>> data =  getIntersectingLists();

        DoListsIntersect intersectChecker = new DoListsIntersect();

        boolean result = intersectChecker.doListsIntersect(data.get(0), data.get(1));

        Assert.assertTrue(result);
    }

    @Test
    public void GivenNonIntersectingList_DoListsIntersect_ReturnsFalse()
    {
        ArrayList<Node<String>> data =  getNonIntersectingLists();

        DoListsIntersect intersectChecker = new DoListsIntersect();

        boolean result = intersectChecker.doListsIntersect(data.get(0), data.get(1));

        Assert.assertFalse(result);
    }

    @Test
    public void GivenIntersectingList_DoListsIntersectConstantSpace_ReturnsTrue()
    {
        ArrayList<Node<String>> data =  getIntersectingLists();

        DoListsIntersect intersectChecker = new DoListsIntersect();

        boolean result = intersectChecker.doListsIntersectConstantSpace(data.get(0), data.get(1));

        Assert.assertTrue(result);
    }

    @Test
    public void GivenNonIntersectingList_DoListsIntersectConstantSpace_ReturnsFalse()
    {
        ArrayList<Node<String>> data =  getNonIntersectingLists();

        DoListsIntersect intersectChecker = new DoListsIntersect();

        boolean result = intersectChecker.doListsIntersectConstantSpace(data.get(0), data.get(1));

        Assert.assertFalse(result);
    }

    private ArrayList<Node<String>> getIntersectingLists()
    {
        Node<String> intersecter = new Node<>("linker");
        intersecter.setNext(new Node("finish"));

        Node<String> list1 = new Node<String>("a",intersecter);

        Node<String> list2 = new Node<String>("b", intersecter);

        ArrayList<Node<String>> data = new ArrayList<>();

        data.add(list1);
        data.add(list2);

        return data;
    }

    private ArrayList<Node<String>> getNonIntersectingLists()
    {
        Node<String> list1 = new Node<String>("a");

        Node<String> list2 = new Node<String>("b");

        ArrayList<Node<String>> data = new ArrayList<>();

        data.add(list1);
        data.add(list2);

        return data;
    }
}
