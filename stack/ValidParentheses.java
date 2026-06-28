import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack= new ArrayDeque<>();
        for(int num= 0; num< s.length(); num++){
            if(s.charAt(num)== ')'){
                if(stack.isEmpty()|| stack.pop()!= '(') return false;
                // Check if stack is empty before calling pop()
            }else if(s.charAt(num)== ']'){
                if(stack.isEmpty()|| stack.pop()!= '[') return false;
            }else if(s.charAt(num)== '}'){
                if(stack.isEmpty()|| stack.pop()!= '{') return false;
            }else{
                stack.push(s.charAt(num));
            }
        }
        return stack.isEmpty();
        // If unmatched opening brackets remain in the stack, return false
    }
}