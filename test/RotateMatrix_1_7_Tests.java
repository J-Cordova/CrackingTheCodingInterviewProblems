import com.company.RotateMatrix_1_7;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotateMatrix_1_7_Tests
{
    final private int[][] baseMatrix = new int[][]{
            new int[] { 1, 2},
            new int[] { 4, 3},
    };


    final private int[][] rotatedMatrix = new int[][]{
            new int[] { 4, 1},
            new int[] { 3, 2},
    };

    final private int[][] baseMatrix2 = new int[][]{
            new int[] { 1, 2, 3},
            new int[] { 8, 9, 4},
            new int[] { 7, 6, 5},
    };


    final private int[][] rotatedMatrix2 = new int[][]{
            new int[] { 7, 8, 1},
            new int[] { 6, 9, 2},
            new int[] { 5, 4, 3},
    };

    @Test
    public void GivenRotatableMatrix_RotateMatrix_MatchesRotatedMatrix()
    {
        RotateMatrix_1_7 rotator = new RotateMatrix_1_7();

        int[][] result1 = rotator.RotateMatrix(baseMatrix);
        int[][] result2 = rotator.RotateMatrix(baseMatrix2);

        boolean firstResult = compareArrays(result1,rotatedMatrix);
        boolean secondResult = compareArrays(result2,rotatedMatrix2);

        Assert.assertTrue(firstResult && secondResult);
    }

    private boolean compareArrays(int[][] arr1, int [][] arr2)
    {
        int height = arr1.length;
        int width = arr1[0].length;

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if(arr1[i][j] != arr2[i][j])
                {
                    return false;
                }
            }
        }

        return true;
    }
}
