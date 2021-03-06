package Chapter1_Tests;

import com.company.Chapter1.IsUniqueValidator_1_1;
import org.junit.Assert;
import org.junit.Test;

public class IsUniqueValidator_1_1_Tests
{
    final private String uniqueString = "abc";
    final private String nonUnqiueString = "abcsdaf";

    @Test
    public void isUniqueWithDataStructure_GivenUniqueString_ReturnsTrue()
    {
        IsUniqueValidator_1_1 validator = new IsUniqueValidator_1_1();

        boolean isUnique = validator.isUniqueWithDataStructure(uniqueString);


        Assert.assertTrue(isUnique);
    }

    @Test
    public void isUniqueWithDataStructure_GivenNonUniqueString_ReturnsFalse()
    {
        IsUniqueValidator_1_1 validator = new IsUniqueValidator_1_1();

        boolean isUnique = validator.isUniqueWithDataStructure(nonUnqiueString);


        Assert.assertFalse(isUnique);
    }


    @Test
    public void isUniqueWithOutDataStructure_GivenUniqueString_ReturnsTrue()
    {
        IsUniqueValidator_1_1 validator = new IsUniqueValidator_1_1();

        Boolean isUnique = validator.isUniqueWithOutDataStructure(uniqueString);


        Assert.assertTrue(isUnique);
    }

    @Test
    public void isUniqueWithOutDataStructure_GivenNonUniqueString_ReturnsFalse()
    {
        IsUniqueValidator_1_1 validator = new IsUniqueValidator_1_1();

        Boolean isUnique = validator.isUniqueWithOutDataStructure(nonUnqiueString);


        Assert.assertFalse(isUnique);
    }
}
