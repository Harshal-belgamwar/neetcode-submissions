class Solution {
    public int characterReplacement(String s, int k) {

        int[]freq = new int[26];

        int right = 0,left = 0,maxFreq = 0,windowSize = 0,result = 0;

        for(right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);

            windowSize = right  - left +1;

            while(windowSize - maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
                windowSize = right - left +1;
            }
            result = Math.max(result,windowSize);

        }

        return result;




        
    }
}
