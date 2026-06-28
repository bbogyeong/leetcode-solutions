import java.util.Queue;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        // Use a queue (FIFO) to track the current window of unique characters
        // When a duplicate is found, remove from the front until the duplicate is gone
        int answer= 0;
        for(int num= 0; num< s.length(); num++){
            if(queue.contains(s.charAt(num))){
                if(queue.size()> answer) answer= queue.size();
                while(true){
                    if(queue.poll()== s.charAt(num)) break;
                }
            }
            queue.offer(s.charAt(num));
            if(queue.size()> answer) answer= queue.size();
        }
        return answer;
    }
}