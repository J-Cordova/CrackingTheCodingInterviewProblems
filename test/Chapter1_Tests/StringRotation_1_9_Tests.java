package Chapter1_Tests;

import com.company.Chapter1.StringRotation_1_9;
import org.junit.Assert;
import org.junit.Test;

public class StringRotation_1_9_Tests
{
    final private String testString1 = "waterbottle";
    final private String testString2 = "lewaterbott";

    @Test
    public void GivenRotatedStrings_IsRotatedString_ReturnsTrue()
    {
        StringRotation_1_9 rotationChecker = new StringRotation_1_9();

        boolean result = rotationChecker.isARotation(testString1,testString2);

        Assert.assertTrue(result);
    }
}
