class Solution {
    public int lengthOfLongestSubstring(String s) {

        // if(s.length() == 0) return 0;

        
        HashSet<Character> set = new HashSet<>();

        Queue<Character> dq = new LinkedList<>();
        int maxSize = 0;

        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(!set.contains(x)){
                set.add(x);
                dq.offer(x);
            }else{
                maxSize = Math.max(maxSize,dq.size());
                while(!dq.isEmpty() && dq.peek()!=x){
                    set.remove(dq.peek());
                    dq.poll();
                    
                }
                if(!dq.isEmpty()) dq.poll();
                dq.offer(x);
            }

        }
        maxSize = Math.max(maxSize,dq.size());
        return maxSize;


        
    }
}
