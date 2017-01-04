import com.company.StringCompression_1_6;
import org.junit.Assert;
import org.junit.Test;

public class StringCompression_1_6_Tests
{
    final private String compressableString = "aabccccaaa";
    final private String uncompressableString = "abcdefghij";

    final private String compressedString = "a2b1c4a3";

    @Test
    public void GivenCompressableString_CompressesString_ReturnsCompressedString()
    {
        StringCompression_1_6 compressor = new StringCompression_1_6();

        String result = compressor.CompressString(compressableString);

        Assert.assertTrue(result.compareTo(compressedString) == 0);
    }

    @Test
    public void GivenUnCompressableString_CompressesString_ReturnsOriginalString()
    {
        StringCompression_1_6 compressor = new StringCompression_1_6();

        String result = compressor.CompressString(uncompressableString);

        Assert.assertTrue(result.compareTo(uncompressableString) == 0);
    }
}
