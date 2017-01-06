package com.company;


public class RotateMatrix_1_7
{
    public int[][] RotateMatrix(int[][] matrix)
    {
        int layerCount = matrix[0].length /2;

        int height = matrix.length;
        int width = matrix[0].length;

        for (int i = 0; i < layerCount; i++)
        {
            int begin = i;
            int end = width - i - 1;// each layer gets 2 shorts 4->2, 5->3

            for (int j = begin; j < end; j++)
            {
                int placesToTravel = end;
                int topLeft = matrix[i][j];

                //bottom left -> top left

                //top left      bottom left
                matrix[i][j] = matrix[placesToTravel - j][j];
                //bottom right -> bottom left

                //bottom left                   //bottom right
                matrix[placesToTravel - j][j] = matrix[placesToTravel][placesToTravel - j];

                //top right -> bottom right

                //bottom right                                top right
                matrix[placesToTravel][placesToTravel - j] = matrix[i][placesToTravel - j];

                //matrix[i][placesToTravel - j] = matrix[j][placesToTravel];
                //top left ->  top right

                //top right                 //original top left
                matrix[j][placesToTravel] = topLeft;
            }
        }

        return matrix;
    }


    boolean rotate(int[][] matrix)
    {
        if (matrix.length == 0 || matrix.length != matrix[0].length)return false;
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // save top
                // left -> top
                matrix[first][i] = matrix[last - offset][first];
                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];
                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];
                // top -> right
                matrix[i][last] = top; // right <- saved top

            }
        }
        return true;
    }
    //may be redundant all transitions happen in every turn
    // so we have 4 states in code anyway
    public Direction transitionDirection(Direction direction)
    {
        switch (direction)
        {
            case up:
                return Direction.right;
            case down:
                return Direction.left;
            case left:
                return Direction.up;
            case right:
                return Direction.down;
            default:
                return Direction.right;
        }
    }

    enum Direction
    {
        up,
        down,
        left,
        right
    }
}
