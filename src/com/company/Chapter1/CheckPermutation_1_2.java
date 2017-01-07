package com.company.Chapter1;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class CheckPermutation_1_2
{
    public boolean isPermutation(String a, String b)
    {
        if (a.length() != b.length()) return false;

        a = sort(a);
        b = sort(b);

        for (int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) != b.charAt(i)) return false;
        }

        return  true;
    }

    private String sort(String str)
    {
        char[] toSort = str.toCharArray();
        Arrays.sort(toSort);
        return new String(toSort);
    }
}
