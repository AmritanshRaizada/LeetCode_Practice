class Solution {
    public String largestOddNumber(String num) {
        num=num.trim();
        StringBuilder s = new StringBuilder(num);
        while(s.length()>0) {
            if (chechodd(s.charAt(s.length()-1))) {
                return s.toString();
            } else {
                s.deleteCharAt(s.length()-1);
            }
        }
        return "";
    }

    private boolean chechodd(char ch) {
        int digit= ch-'0' ;
        return (digit&1)==1;
    }
}