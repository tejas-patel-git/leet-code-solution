public class Solution
{
    public int LengthOfLastWord(string s)
    {
        if (s.Length == 1) return s[0] == ' ' ? 0 : 1;
        int lastIndex = 0;
        bool flag = false;
        for (int i = s.Length - 1; i >= 0; i--)
        {
            if (flag && s[i] == ' ')
            {
                return lastIndex - i;
            }
            else if (!flag && s[i] != ' ')
            {
                flag = true;
                lastIndex = i;
            }
        }
        return flag ? lastIndex + 1 : 0;
    }
}