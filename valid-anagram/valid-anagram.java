class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        int s_len= s.length();
        for (int i=0; i<s_len; i++){
            if (hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            }
            else {
                hash.put(s.charAt(i), 1);
            }
            if (hash.containsKey(t.charAt(i))){
                hash.put(t.charAt(i), hash.get(t.charAt(i)) - 1);
            }
            else {
                hash.put(t.charAt(i), -1);
            }
        }
        
        int[] arr= new int[26];
        for (int j=0; j<26; j++) {
            char curr = (char)('a'+(char)j);
            arr[j]= (hash.getOrDefault(curr, 0));
            if(arr[j] == 0) {
                continue;
            }
            else {
                return false;
            }
        } return true;
    } 
}
        
        

