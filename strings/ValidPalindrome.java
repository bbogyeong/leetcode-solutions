class Solution {
    public boolean isPalindrome(String s) {
        char[] array= s.toLowerCase().toCharArray();
        int front= 0;
        int back= array.length-1;
        // Two Pointer - more efficient than stack, no extra space for filtered string
        while(front< back){
            if(!Character.isLetterOrDigit(array[front])){
                // Character.isLetterOrDigit(c)-> returns true if c is a letter(a-z, A-Z) or digit(0-9)
                // Skip non-alphanumeric characters by moving the pointer
                front++;
            } else if(!Character.isLetterOrDigit(array[back])){
                 back--;
            } else{
                if(array[front]!= array[back]){
                    return false;
                }
                front++; back--;
            }
        }
        return true;
    }
}