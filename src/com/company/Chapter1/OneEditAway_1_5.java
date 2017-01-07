package com.company.Chapter1;

import java.util.HashSet;

public class OneEditAway_1_5
{
    public boolean isStringOneChangeAway(String a, String b)
    {
        if (Math.abs(a.length() - b.length()) > 1) return false;

        String longerString = a.length() > b.length() ? a : b;
        String shorterString = a.length() > b.length() ? b : a;

        HashSet<Character> shortChars = new HashSet<Character>();

        for(char c: shorterString.toCharArray())
        {
            shortChars.add(c);
        }

        int diffCount = 0;

        for(char character : longerString.toCharArray())
        {
            if (!shortChars.contains(character))
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
