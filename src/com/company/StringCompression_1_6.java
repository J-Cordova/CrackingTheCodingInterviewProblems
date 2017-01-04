package com.company;


public class StringCompression_1_6
{
    public String CompressString(String str)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);

            int count = 1;
            while(i + 1 < str.length() && str.charAt(i+1) == c)
            {
                count++;
                i++;
            }

            sb.append(c);
            sb.append(count);
        }

        if (sb.length() >= str.length())
        {
            return str;
        }
        else
        {
            return sb.toString();
        }
    }
}
