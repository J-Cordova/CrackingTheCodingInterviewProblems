package com.company;

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
}
