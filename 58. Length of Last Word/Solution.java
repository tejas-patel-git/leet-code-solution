class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1)
            return s.charAt(0) == ' ' ? 0 : 1;

        int lastIndex = 0;
        boolean lastSpaceFound = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            
            if (lastSpaceFound && s.charAt(i) == ' ')
                return lastIndex - i;
            else if (!lastSpaceFound && s.charAt(i) != ' ') {
                lastSpaceFound = true;
                lastIndex = i;
            }
        }
        return lastSpaceFound ? lastIndex + 1 : 0;
    }
}