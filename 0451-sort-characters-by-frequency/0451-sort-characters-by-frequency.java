class Solution {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for(char ch : charArray){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        // Since it's sorted in ascending order, reverse it for descending
        return sb.reverse().toString();
    }}