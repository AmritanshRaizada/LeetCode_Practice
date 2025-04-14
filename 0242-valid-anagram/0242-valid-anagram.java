class Solution {
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Compare both maps
        return map1.equals(map2);
    }
}