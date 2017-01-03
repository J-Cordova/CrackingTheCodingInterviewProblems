import com.company.URLify_1_3;
import org.junit.Assert;
import org.junit.Test;


public class URLify_1_3_Tests
{
    final private String preUrlifiedString = "a hat  ";
    final private int lengthOfpreUrlifiedString = 5;
    final private String urlifiedString = "a%20hat";

    @Test
    public void GivenStringWithSpaces_URLifyProducesURLString_ReturnsExpectedString()
    {
        URLify_1_3 urlIfier = new URLify_1_3();

        String result = urlIfier.URLify(preUrlifiedString, lengthOfpreUrlifiedString);

        Assert.assertTrue(result.equals(urlifiedString));
    }

}
