package Chapter2_Tests;

import com.company.Chapter2.SumLists;
import org.junit.Assert;
import org.junit.Test;


public class SumLists_Tests
{
    @Test
    public void GivenLists_SumsLists_ReturnsProperSum()
    {
        SumLists summer = new SumLists();

        int result = summer.sumLists(TestListGenerator.getTestStringIntegerList(),
                                     TestListGenerator.getTestStringIntegerList2());

        Assert.assertTrue(result == 6666);
    }
}
