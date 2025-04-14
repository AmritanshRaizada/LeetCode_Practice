class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];

        for(char ch : s.toCharArray()){
            map[ch - (int)'a'] ++; ;
        }

        for(char ch : t.toCharArray()){
            map[ch - (int)'a']--;
        }


        for(int i=0 ; i<map.length ; i++){
            if( map[i] != 0 ){
                return false;
            }
        }

        return true;
    }
}