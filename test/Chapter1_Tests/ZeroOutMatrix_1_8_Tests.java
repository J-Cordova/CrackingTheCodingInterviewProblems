package Chapter1_Tests;

import com.company.Chapter1.ZeroOutMatrix_1_8;
import org.junit.Assert;
import org.junit.Test;

public class ZeroOutMatrix_1_8_Tests
{
    final private int[][] base2Matrix = new int[][]{
            new int[] { 1, 2},
            new int[] { 0, 3},
    };


    final private int[][] zeroedMatrix2 = new int[][]{
            new int[] { 0, 2},
            new int[] { 0, 0},
    };

    final private int[][] base3Matrix = new int[][]{
            new int[] { 1, 2, 3},
            new int[] { 8, 0, 4},
            new int[] { 7, 6, 5},
    };


    final private int[][] zeroedMatrix3 = new int[][]{
            new int[] { 1, 0, 3},
            new int[] { 0, 0, 0},
            new int[] { 7, 0, 5},
    };

    @Test
    public void Given2x2MatrixWithZeros_ZeroOutMatrix_ReturnsMatrixWithRowColumnsZeroedOut()
    {
        ZeroOutMatrix_1_8 zeroer = new ZeroOutMatrix_1_8();

        int[][] result = zeroer.zeroOutMatrix(arrayCopy(base2Matrix));
        int[][] result2 = zeroer.zeroOutWithConstantSpace(arrayCopy(base2Matrix));

        Assert.assertTrue(compareArrays(result,zeroedMatrix2));
        Assert.assertTrue(compareArrays(result2,zeroedMatrix2));
    }

    @Test
    public void Given3x3MatrixWithZeros_ZeroOutMatrix_ReturnsMatrixWithRowColumnsZeroedOut()
    {
        ZeroOutMatrix_1_8 zeroer = new ZeroOutMatrix_1_8();

        int[][] result = zeroer.zeroOutMatrix(arrayCopy(base3Matrix));
        int[][] result2 = zeroer.zeroOutWithConstantSpace(arrayCopy(base3Matrix));

        Assert.assertTrue(compareArrays(result,zeroedMatrix3));
        Assert.assertTrue(compareArrays(result2,zeroedMatrix3));
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

    private int[][] arrayCopy(int[][] aSource) {
        int[][] aDestination = new int[aSource.length][aSource[0].length];
        for (int i = 0; i < aSource.length; i++) {
            System.arraycopy(aSource[i], 0, aDestination[i], 0, aSource[i].length);
        }
        return aDestination;
    }
}
