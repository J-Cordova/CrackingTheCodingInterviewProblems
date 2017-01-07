package com.company.Chapter1;


public class StringRotation_1_9
{

    public boolean isARotation(String str1, String str2)
    {
        if (str1.length() != str2.length() || str1.length() == 0) return false;

        return isSubString((str1 + str1), str2);
    }

    private boolean isSubString(String str1, String str2)
    {
        return str1.toLowerCase().contains(str2.toLowerCase());
    }
}
