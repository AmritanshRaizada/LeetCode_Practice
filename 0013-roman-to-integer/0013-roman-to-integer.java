class Solution {
    public int romanToInt(String s) {
          Map<Character,Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int res=0;
        for(char ch =0;ch<s.length()-1;ch++){
            if(map.get(s.charAt(ch))<map.get(s.charAt(ch+1))){
                res-=map.get(s.charAt(ch));
            }
            else{
                res+=map.get(s.charAt(ch));
            }
        }
        return res+ map.get(s.charAt(s.length()-1));
    }
}