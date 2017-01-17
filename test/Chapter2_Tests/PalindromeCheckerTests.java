package Chapter2_Tests;


import com.company.Chapter2.Node;
import com.company.Chapter2.PalindromeChecker;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckerTests
{
    @Test
    public void GivenPalindrome_IsPalindrome_ReturnsTrue()
    {
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.isPalindrome(GetPalindrome());

        Assert.assertTrue(result);
    }

    @Test
    public void GivenNonPalindrome_IsPalindrome_ReturnsFalse()
    {
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.isPalindrome(GetNonPalindrome());

        Assert.assertFalse(result);
    }

    private Node<String> GetPalindrome()
    {
        return new Node<String>("a", new Node<String>("b", new Node<String>("b", new Node<String>("a", null))));
    }

    private Node<String> GetNonPalindrome()
    {
        return new Node<String>("a", new Node<String>("b", new Node<String>("c", new Node<String>("a", null))));
    }
}
