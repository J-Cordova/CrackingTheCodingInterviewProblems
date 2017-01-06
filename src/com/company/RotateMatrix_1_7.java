package com.company;


public class RotateMatrix_1_7
{
    public int[][] RotateMatrix(int[][] matrix)
    {
        int layerCount = matrix.length / 2;

        int width = matrix.length;

        for (int i = 0; i < layerCount; i++)
        {
            // each layer gets 2 shorter 4->2, 5->3
            int end = width  - 1 - (i*2);

            for (int j = i; j < end; j++)
            {
                int topLeft = matrix[i][j];

                //top left     bottom left
                matrix[i][j] = matrix[end - j][i];

                //bottom left        bottom right
                matrix[end - j][i] = matrix[end][end - j];

                //bottom right         top right
                matrix[end][end - j] = matrix[j][end];

                //top right      original top left
                matrix[j][end] = topLeft;
            }
        }

        return matrix;
    }
}
