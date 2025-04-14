class Solution {
    public boolean isAnagram(String s1, String s2) {
        char[] arr=s1.toCharArray();
        HashMap<Character,Integer> map= new HashMap<>();
        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
//        StringBuilder sb = new StringBuilder(s2);
        char[] arr2=s2.toCharArray();
        for(char ch:arr2){
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}