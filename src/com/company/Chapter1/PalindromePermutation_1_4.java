package com.company.Chapter1;

public class PalindromePermutation_1_4
{
    public boolean CheckIfPermutationOfPalindrome(String str)
    {
        int baseLetter = (int)'a';
        str = str.replace(" ", "").toLowerCase();

        int[] letterCount = new int[(int)'z' - baseLetter];
        int OddNumberOccurences = 0;

        for (int i = 0; i < str.length(); i++)
        {
            letterCount[(int)str.charAt(i) - baseLetter] = letterCount[(int)str.charAt(i) - baseLetter] + 1;
        }

        for (int i = 0; i < letterCount.length; i++)
        {
            if (letterCount[i] % 2 != 0)
            {
                OddNumberOccurences++;
            }
        }

        return OddNumberOccurences < 2;
    }
}
