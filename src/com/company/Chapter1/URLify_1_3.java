package com.company.Chapter1;


public class URLify_1_3
{
    public String URLify(String input, int trueLength)
    {
        int end = trueLength -1;

        char[] chars = input.toCharArray();

        for (int i = 0; i < trueLength; i++)
        {
            if (chars[i] == ' ')
            {
                for (int k = end; k > i; k--)
                {
                    chars[k + 2] = chars[k];
                }
                chars[i] = '%';
                chars[i+1] = '2';
                chars[i+2] = '0';
                end += 2;//Account for added characters
            }
        }
        return new String(chars);
    }


}
