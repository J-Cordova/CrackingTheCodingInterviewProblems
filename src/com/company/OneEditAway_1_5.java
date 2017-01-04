package com.company;

import java.util.HashSet;

public class OneEditAway_1_5
{
    public boolean isStringOneChangeAway(String a, String b)
    {
        if (Math.abs(a.length() - b.length()) > 1) return false;

        HashSet<Character> aChars = new HashSet();

        for(char c: a.toCharArray())
        {
            aChars.add(c);
        }

        int diffCount = 0;

        for(char character : b.toCharArray())
        {
            if (!aChars.contains(character))
            {
                diffCount++;
                if (diffCount > 1)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
