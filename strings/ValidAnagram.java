class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap= new HashMap<>();
        HashMap<Character, Integer> tMap= new HashMap<>();
        // Store each character's frequency as key-value pairs
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for(int num= 0; num< sChar.length; num++){
            sMap.put(sChar[num], sMap.getOrDefault(sChar[num], 0)+1);
            // getOrDefault: returns 0 if key not found, avoiding NullPointerException
        }
        for(int num= 0; num< tChar.length; num++){
            tMap.put(tChar[num], tMap.getOrDefault(tChar[num], 0)+1);
        }
        if(sMap.equals(tMap)){
            return true;
        }
        return false;
        
    }
}