package Chapter1_Tests;

import com.company.Chapter1.OneEditAway_1_5;
import org.junit.Assert;
import org.junit.Test;

public class OneEditAway_1_5_Tests
{
    final private String masterString = "bye";
    final private String oneEditAway = "be";
    final private String multiEditAway = "byod";

    @Test
    public void givenOneEditAwayString_IsStringOneChangeAway_ReturnsTrue()
    {
        OneEditAway_1_5 oneEditValidator = new OneEditAway_1_5();

        boolean result = oneEditValidator.isStringOneChangeAway(masterString,oneEditAway);

        Assert.assertTrue(result);
    }

    @Test
    public void givenMultiEditAwayString_IsStringOneChangeAway_ReturnsFalse()
    {
        OneEditAway_1_5 oneEditValidator = new OneEditAway_1_5();

        boolean result = oneEditValidator.isStringOneChangeAway(masterString,multiEditAway);

        Assert.assertFalse(result);
    }
}
