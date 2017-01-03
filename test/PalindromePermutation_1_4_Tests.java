import com.company.PalindromePermutation_1_4;
import org.junit.Assert;
import org.junit.Test;


public class PalindromePermutation_1_4_Tests
{
    final private String palindromeString = "asd das";
    final private String nonPalindromeString = "asdu dase";

    @Test
    public void GivenPalindromeString_CheckIfStringIsAPalindromePermutation_ReturnsTrue()
    {
        PalindromePermutation_1_4 palindromeChecker = new PalindromePermutation_1_4();

        boolean result = palindromeChecker.CheckIfPermutationOfPalindrome(palindromeString);

        Assert.assertTrue(result);
    }

    @Test
    public void GivenNonPalindromeString_CheckIfStringIsAPalindromePermutation_ReturnsTrue()
    {
        PalindromePermutation_1_4 palindromeChecker = new PalindromePermutation_1_4();

        boolean result = palindromeChecker.CheckIfPermutationOfPalindrome(nonPalindromeString);

        Assert.assertFalse(result);
    }
}
