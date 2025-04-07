class Solution {
    public String longestCommonPrefix(String[] strs) {
  if (strs == null || strs.length == 0) {  
            return "";  
        }  

        // Start with the first string as the prefix  
        String prefix = strs[0];  
        
        for (int i = 1; i < strs.length; i++) {  
            // Compare prefix with the current string  
            while (strs[i].indexOf(prefix) != 0 && prefix.length() > 0) {  
                // Shorten the prefix until it matches the start of the current string  
                prefix = prefix.substring(0, prefix.length() - 1);  
            }  
        }  
        
        return prefix;  
    }  
}