package Chapter1_Tests;

import com.company.Chapter1.CheckPermutation_1_2;
import org.junit.Assert;
import org.junit.Test;


public class CheckPermutation_1_2_Tests
{
    final private String perm1 = "abc";
    final private String perm2 = "cab";

    final private  String nonPerm1 = "xyz";
    final private String nonPerm2 = "abc";

    @Test
    public void isPermutation_GivenPermutationStrings_ReturnsTrue()
    {
        CheckPermutation_1_2 permChecker = new CheckPermutation_1_2();

        boolean result = permChecker.isPermutation(perm1, perm2);

        Assert.assertTrue(result);
    }

    @Test
    public void isPermutation_GivenNonPermutationStrings_ReturnsFalse()
    {
        CheckPermutation_1_2 permChecker = new CheckPermutation_1_2();

        boolean result = permChecker.isPermutation(nonPerm1, nonPerm2);

        Assert.assertFalse(result);
    }
}
