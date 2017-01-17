package com.company.Chapter2;


public class PalindromeChecker
{
    public boolean isPalindrome(Node<String> list)
    {
        int counter = 0;

        StringBuilder sb = new StringBuilder();

        while(list != null)
        {
            sb.append(list.getData());
            list = list.getNext();
        }

        if (sb.length() < 2){return false;}

        for (int i = 0; i < sb.length() / 2; i++)
        {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 -i))
            {
                return false;
            }
        }

        return true;
    }
}
