package com.company.Chapter1;

import javafx.util.Pair;

import java.util.ArrayList;

public class ZeroOutMatrix_1_8
{
    public int[][] zeroOutMatrix(int[][] matrix)
    {
        ArrayList<Pair<Integer,Integer>> points = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    points.add(new Pair<Integer,Integer>(i,j));
                }
            }
        }

        for (Pair<Integer,Integer> coords: points)
        {
            for (int i = 0; i < matrix.length; i++)
            {
                matrix[coords.getKey()][i] = 0;
            }

            for (int i = 0; i < matrix[coords.getValue()].length; i++)
            {
                matrix[i][coords.getValue()] = 0;
            }
        }

        return matrix;
    }

    public int[][] zeroOutWithConstantSpace(int[][] matrix)
    {
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < matrix.length; i++)
        {
            if (matrix[0][i] == 0)
            {
                firstRowZero = true;
                break;
            }
        }

        for (int i = 0; i < matrix[0].length; i++)
        {
            if (matrix[i][0] == 0)
            {
                firstColZero = true;
                break;
            }
        }

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++)
        {
            if(matrix[0][i] == 0)
            {
                zeroOutColumn(i,matrix);
            }
        }

        for (int i = 1; i < matrix.length; i++)
        {
            if(matrix[i][0] == 0)
            {
                zeroOutRow(i,matrix);
            }
        }

        if (firstRowZero)
        {
            zeroOutRow(0, matrix);
        }

        if (firstColZero)
        {
            zeroOutColumn(0, matrix);
        }

        return matrix;
    }

    private void zeroOutColumn(int colIndex, int[][]matrix)
    {
        for (int i = 0; i < matrix[0].length; i++)
        {
            matrix[i][colIndex] = 0;
        }
    }

    private void zeroOutRow(int rowIndex, int[][]matrix)
    {
        for (int i = 0; i < matrix[0].length; i++)
        {
            matrix[rowIndex][i] = 0;
        }
    }

}
