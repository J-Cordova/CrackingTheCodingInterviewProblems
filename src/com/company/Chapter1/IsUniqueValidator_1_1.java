package com.company.Chapter1;

import java.util.HashSet;


public class IsUniqueValidator_1_1
{
    public boolean isUniqueWithDataStructure(String str)
    {
        HashSet<Character> chars = new HashSet<>();

        for(char c : str.toCharArray())
        {
            if (chars.contains(c))
            {
                return false;
            }
            else
            {
                chars.add(c);
            }
        }

        return true;
    }

    public boolean isUniqueWithOutDataStructure(String str)
    {
        for (int i = 0; i < str.length() ; i++)
        {
            for (int j = i + 1; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
